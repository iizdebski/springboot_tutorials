package com.izdebski.SpringBootAOPDefinePointcut.service.impl;

import com.izdebski.SpringBootAOPDefinePointcut.model.Account;
import com.izdebski.SpringBootAOPDefinePointcut.service.impl.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Override
    public void updateAccountBalance(Account account, Long amount){
        System.out.println("Account No:"+account.getAccountNumber()+", Amount:"+amount);
    }
}