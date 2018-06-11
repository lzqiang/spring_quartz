package com.ttpai;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	@RequestMapping(value="login")
	@ResponseBody
	public String hello(String userName,String password){
		return "name:"+userName+"password:"+password;
	}
}
