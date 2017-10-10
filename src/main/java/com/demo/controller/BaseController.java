package com.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 基础控制器
 */
public abstract class BaseController {

    protected final Logger logger = LoggerFactory.getLogger(getClass());

    public String query(String name) {
        if ("a".equals(name)) {
            return "a";
        } else if ("b".equals(name)) {
            return "b";
        } else {
            return query();
        }
    }

    protected String query(){
        return null;
    }

}
