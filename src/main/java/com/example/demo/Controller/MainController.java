package com.example.demo.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demos")
public class MainController {

    @GetMapping()
    public ResponseEntity<String> Home() {
        return new ResponseEntity<>("<h1> Hai, Welcome to My Demo Project </h1>", HttpStatus.OK);
    }

    @GetMapping("/homes")
    public ResponseEntity<String> Homes() {
        return new ResponseEntity<>("<h1><i> Welcome to My Demo Project </i></h1>", HttpStatus.OK);
    }
}
