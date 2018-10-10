package com.zzk.freshman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontendController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }
}
