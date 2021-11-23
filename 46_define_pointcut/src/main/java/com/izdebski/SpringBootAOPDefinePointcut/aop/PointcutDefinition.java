package com.izdebski.SpringBootAOPDefinePointcut.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutDefinition {
    /*
     @Pointcut("within(com.izdebski.SpringBootAOPDefinePointcut.controller..*)")
    */

    @Pointcut("within(com.izdebski.SpringBootAOPDefinePointcut.web..*)")
    public void webLayer() {

    }

    @Pointcut("within(com.izdebski.SpringBootAOPDefinePointcut.service..*)")
    public void serviceLayer() {

    }

    @Pointcut("within(com.izdebski.SpringBootAOPDefinePointcut.dao..*)")
    public void dataAccessLayer() {

    }
}