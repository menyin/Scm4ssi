package com.cny.scm.service.impl;

import com.cny.scm.dao.AccountMapper;
import com.cny.scm.entity.Account;
import com.cny.scm.entity.Page;
import com.cny.scm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl extends BaseServiceImpl<Account> implements AccountService{
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public Account login(Account account) {
        return accountMapper.login(account);
    }

   /* @Override
    public List<Account> selectPageList(Page<Account> page) {
        List<Account> list=accountMapper.selectPageList(page);
        //后面再做改造
        return list;
    }*/

    /*public Page<Account> selectPage(Page<Account> page) {
        List<Account> list=accountMapper.selectPageList(page);
        page.setList(list);
        Integer total = accountMapper.getPageTotal(page);
        page.setTotal(total);
        return page;

    }*/
}
