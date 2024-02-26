package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demos")
public class MainController {

    @GetMapping()
    public String Home() {
        return ("<h1> Hai, Welcome to My Demo Project </h1>");
    }

    @GetMapping("/homes")
    public String Homes() {
        return ("<h1><i> Welcome to My Demo Project </i></h1>");
    }
}
