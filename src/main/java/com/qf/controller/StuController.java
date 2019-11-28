package com.qf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auth RuanHao
 * @Time 2019/11/28 13:44
 **/
@Controller
@RequestMapping("stu")
public class StuController {

    @RequestMapping("/list")
    public String list(){

        return "stuList";
    }
}
