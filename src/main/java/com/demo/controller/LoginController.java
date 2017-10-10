package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 */
@Controller
@RequestMapping("/login")
public class LoginController extends BaseController{

    @GetMapping("")
    public String login(String name) {
        return query(name);
    }

    @Override
    protected String query(){
        logger.info("==================== return login ====================");
        return "login";
    }
}
