package com.example.demo.controllers;


import com.example.demo.models.UserModel;
import com.example.demo.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserController {
    private final UserService userService;

    UserController(UserService userService){
        this.userService=userService;
    }
    @PostMapping("/signup")
    public ResponseEntity<String> Signup(@RequestBody UserModel User){
        boolean IsUser=userService.Isuser(User.getEmail());
        if(IsUser){
            return ResponseEntity.status(201).body("user already exists");
        }
        userService.Adduser(User);
        return ResponseEntity.status(200).body("user created");
    }

}
