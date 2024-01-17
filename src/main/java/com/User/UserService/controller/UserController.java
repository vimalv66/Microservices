package com.User.UserService.controller;

import com.User.UserService.Entity.CustomUser;

import com.User.UserService.VO.ResponseTemplateVO;
import com.User.UserService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/add")
    public CustomUser saveuser(@RequestBody CustomUser user){
        return userService.save(user);
    }
    @GetMapping("/{id}")
    public ResponseTemplateVO getUserwithDepartment(@PathVariable("id") Long userid){
        return userService.getUserwithDepartment(userid);

    }







}
