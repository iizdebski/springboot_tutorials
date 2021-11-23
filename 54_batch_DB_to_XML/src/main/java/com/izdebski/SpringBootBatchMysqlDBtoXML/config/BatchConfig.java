package com.izdebski.SpringBootBatchMysqlDBtoXML.config;

import com.izdebski.SpringBootBatchMysqlDBtoXML.model.Person;
import com.izdebski.SpringBootBatchMysqlDBtoXML.processor.PersonItemProcessor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.batch.item.xml.StaxEventItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.oxm.xstream.XStreamMarshaller;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableBatchProcessing
public class BatchConfig {

    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Autowired
    private DataSource dataSource;

    @Bean
    public JdbcCursorItemReader<Person> reader(){
        JdbcCursorItemReader<Person> cursorItemReader = new JdbcCursorItemReader<>();
        cursorItemReader.setDataSource(dataSource);
        cursorItemReader.setSql("SELECT person_id,first_name,last_name,email,age FROM person");
        cursorItemReader.setRowMapper(new PersonRowMapper());
        return cursorItemReader;
    }

    @Bean
    public PersonItemProcessor processor(){
        return new PersonItemProcessor();
    }

    @Bean
    public StaxEventItemWriter<Person> writer(){
        StaxEventItemWriter<Person> writer = new StaxEventItemWriter<Person>();
        writer.setResource(new ClassPathResource("persons.xml"));

        Map<String, String> aliasesMap = new HashMap<String, String>();
        aliasesMap.put("person", "com.izdebski.SpringBootBatchMysqlDBtoXML.model.Person");
        XStreamMarshaller marshaller = new XStreamMarshaller();
        marshaller.setAliases(aliasesMap);
        writer.setMarshaller(marshaller);
        writer.setRootTagName("persons");
        writer.setOverwriteOutput(true);
        return writer;
    }

    @Bean
    public Step step1(){
        return stepBuilderFactory.get("step1").<Person,Person>chunk(100).reader(reader()).processor(processor()).writer(writer()).build();
    }

    @Bean
    public Job exportPerosnJob(){
        return jobBuilderFactory.get("exportPeronJob").incrementer(new RunIdIncrementer()).flow(step1()).end().build();
    }
}