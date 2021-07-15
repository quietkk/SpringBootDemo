package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//相当于方法上的@ResponseBody + 类名上的@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String Hello(){
        return "hhhhsgsh";
    }
}
