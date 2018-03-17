package com.cny.scm.dao;

import com.cny.scm.entity.Account;

import java.util.List;

public interface AccountMapper extends BaseMapper<Account>{
    public Account login(Account account);
}