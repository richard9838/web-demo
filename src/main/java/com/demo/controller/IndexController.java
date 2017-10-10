package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页
 */
@Controller
@RequestMapping("/index")
public class IndexController extends BaseController{

    @GetMapping("")
    public String index(String name) {

        logger.info("====================index====================");

        return query(name);

    }

    @Override
    protected String query(){
        logger.info("==================== return c ====================");
        return "c";
    }

}
