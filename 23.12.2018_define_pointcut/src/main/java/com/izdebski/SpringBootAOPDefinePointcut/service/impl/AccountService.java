package com.izdebski.SpringBootAOPDefinePointcut.service.impl;

import com.izdebski.SpringBootAOPDefinePointcut.model.Account;

public interface AccountService {
    public abstract void updateAccountBalance(Account account, Long amount);
}