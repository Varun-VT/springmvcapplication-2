package com.stackroute;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@org.springframework.stereotype.Controller
public class UserController {

    @PostMapping("/show")
    public ModelAndView getName(HttpServletRequest req){
        User user= new User();
        user.setPassword(req.getParameter("password"));
        user.setName(req.getParameter("username"));
        ModelAndView modelAndView=new ModelAndView("display");
        modelAndView.addObject("user", user);
        return  modelAndView;
    }

}
