package com.toysforshorts;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

@RequestMapping("/")
 public String Sample(){
    return "Hello world";
 }
}
