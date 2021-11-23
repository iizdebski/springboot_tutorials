package com.izdebski.SpringBootAOPAroundAdvice.aspect;

import com.izdebski.SpringBootAOPAroundAdvice.model.Account;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AccountServiceAspect {

    @Around ("execution(* com.izdebski.SpringBootAOPAroundAdvice.service.AccountServiceImpl.updateAccount*(..))")

    public Object aroundAdvice(ProceedingJoinPoint joinPoint){
        System.out.println("Before method:"+joinPoint.getSignature());

        long sTime = System.currentTimeMillis();
        Object object= null;
        try {
            object=joinPoint.proceed();
            if(object instanceof Account){
                Account account =(Account)object;
                System.out.println(account);
            }
        } catch (Throwable ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("After method:"+joinPoint.getSignature());
        long eTime = System.currentTimeMillis();

        System.out.println("Total execution time taken by Method:"+joinPoint.getSignature() +" is :"+(eTime-sTime)+" ms");
        return object;
    }
}