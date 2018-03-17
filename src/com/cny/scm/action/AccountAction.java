package com.cny.scm.action;

import com.cny.scm.entity.Account;
import com.cny.scm.entity.Page;
import com.cny.scm.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/account")
public class AccountAction {
    @Resource
    private AccountService accountService;
    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }
    @RequestMapping("/login")
    public String login(Model model, Account account) {
       /*
       //测试基本的访问
       account.setAccLogin("admin");
        account.setAccPass("admin");
        try {
            Account loginAccount = accountService.login(account);
            if (loginAccount != null) {
                model.addAttribute("myData", "成功成功！");
            }else{
                model.addAttribute("myData", "失败失败！");
            }
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("myData", "失败失败！");
        }*/

       //测试
        /*Page<Account> accountPage = new Page<>();
        accountPage.setSize(3);
        accountPage.setStartIndex(2);
        accountPage.setKeyword("Admin");
        List<Account> accounts = accountService.selectPageList(accountPage);
        return "WEB-INF/account/index";*/
        return "WEB-INF/account/index";
    }

    @RequestMapping("/page")
    @ResponseBody
    public Object getPage(Page<Account> page) {
            accountService.selectPage(page);
            return page.getPageMap();

    }
}
