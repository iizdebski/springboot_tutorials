package com.izdebski.SpringAOPBeforeAndAfterAdviceUsingXML.service;

import com.izdebski.SpringAOPBeforeAndAfterAdviceUsingXML.model.Account;

public class AccountServiceImpl {

    public static void updateAccountBalance(Account account, Long amount){
        System.out.println("Account No:"+account.getAccountNumber()+", Amount:"+amount);
    }
}
