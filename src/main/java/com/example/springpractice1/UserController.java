package com.example.springpractice1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
   @GetMapping()
   public String test() {
       System.out.println("TEST!!!");
       return "Test";
   }
}
