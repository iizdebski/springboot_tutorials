package com.izdebski.SpringBootBatchMysqlDBtoXML.processor;

import com.izdebski.SpringBootBatchMysqlDBtoXML.model.Person;
import org.springframework.batch.item.ItemProcessor;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {
    @Override
    public Person process(Person person) throws Exception {
        return person;
    }
}
