package com.cny.scm.action;

//import cn.itcast.scm.entity.SysParam;
//import cn.itcast.scm.service.SysParamService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Map;

/**
 * 此action用于对系统参数（系统数据字典）的管理
 */
@Controller
@RequestMapping("/sysParam")
public class SysParamAction extends BaseAction {
	/*@Resource
	private SysParamService sysParamService;

	
	 @RequestMapping(value="/insert")
	 @ResponseBody //如果返回json格式，需要这个注解，这里用来测试环境	 
	public Object insert(SysParam sysParam){
		 //添加到数据库的系统参数表
		 
		 reloadSysParam();
		
		 return null;
	}
	
	
	
	//后边可以用来重新加载参数
	@RequestMapping(value="/reload")
	@ResponseBody
	public void reloadSysParam() {
		loadSysParam();
	}
	
	//系统启动时加载参数
	@PostConstruct
	public void initSysParam(){
		loadSysParam();
	}
	
	//用来加载系统参数	
	public void loadSysParam(){
		Map<String, Object> sysParamMap = sysParamService.selectList();
		application.setAttribute("sysParam", sysParamMap);
		System.out.println("===================系统参数加载成功2=====================");
	}*/
	

}
