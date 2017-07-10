package com.cn.ypd.controller;  
  
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;  
  
import com.cn.ypd.domain.User;  
import com.cn.ypd.service.IUserService;  
  
@Controller  
@RequestMapping("/user")  
public class UserController {  
    @Autowired 
    private IUserService userService;  
      
    @RequestMapping("/showUser")  
    public String toIndex(HttpServletRequest request,Model model){  
        int userId = Integer.parseInt(request.getParameter("id"));  
        User user = this.userService.getUserById(userId);  
        model.addAttribute("user", user);  
        return "showUser";  
    }
    @RequestMapping("/index")
    public String index(HttpServletRequest request,Model model){
    	return "index";
    }
}