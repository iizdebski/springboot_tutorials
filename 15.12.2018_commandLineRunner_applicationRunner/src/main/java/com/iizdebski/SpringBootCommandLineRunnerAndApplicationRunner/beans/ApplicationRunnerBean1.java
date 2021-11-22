package com.iizdebski.SpringBootCommandLineRunnerAndApplicationRunner.beans;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class ApplicationRunnerBean1 implements ApplicationRunner {


    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        System.out.println("ApplicationRunnerBean1...");
    }
}