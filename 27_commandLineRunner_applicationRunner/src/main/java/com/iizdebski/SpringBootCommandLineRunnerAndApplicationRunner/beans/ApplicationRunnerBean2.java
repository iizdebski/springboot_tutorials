package com.iizdebski.SpringBootCommandLineRunnerAndApplicationRunner.beans;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class ApplicationRunnerBean2 implements ApplicationRunner {


    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        System.out.println("ApplicationRunnerBean2...");
    }
}