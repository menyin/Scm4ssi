package com.cny.scm.system;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SysInitServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    public void init() throws ServletException {
        Map<String, Object> sysParamMap = new HashMap<>();

        Map<String, Object> subParamMap = new HashMap<>();
        subParamMap.put("1", "一级供应商");
        subParamMap.put("2", "二级供应商");
        subParamMap.put("3", "三级供应商");
        subParamMap.put("4", "四级供应商");

        Map<String,Object> goodsColorMap =new HashMap<String,Object>();
        goodsColorMap.put("1","红色");
        goodsColorMap.put("2","绿色");
        goodsColorMap.put("3","蓝色");

        sysParamMap.put("subType", subParamMap);
        sysParamMap.put("goodsColor", goodsColorMap);

        this.getServletContext().setAttribute("sysParam", sysParamMap);

        System.out.println("-------------------系统参数加载成功---------------------");

    }
}
