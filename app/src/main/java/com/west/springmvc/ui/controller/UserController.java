package com.west.springmvc.ui.controller;

import com.west.springmvc.ui.model.request.UserDetailsRequestModel;
import com.west.springmvc.ui.model.response.UserRest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    @GetMapping
    public String getUser() {
        return "get user was called";
    }

    @PostMapping
    public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails) {
        return null;
    }

    @PutMapping
    public String updateUser() {
        return "Update user was called";
    }

    @DeleteMapping
    public String deleteUser() {
        return "delete user was called";
    }
}
