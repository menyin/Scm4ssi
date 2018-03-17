package com.cny.scm.service;

import com.cny.scm.entity.Account;

import java.util.List;

public interface AccountService extends BaseService<Account>{
    public Account login(Account account);
}
