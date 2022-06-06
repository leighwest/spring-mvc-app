package com.west.springmvc.ui.controller;

import com.west.springmvc.service.UserService;
import com.west.springmvc.shared.dto.UserDto;
import com.west.springmvc.ui.model.request.UserDetailsRequestModel;
import com.west.springmvc.ui.model.response.UserRest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public String getUser() {
        return "get user was called";
    }

    @PostMapping
    public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails) {

        UserRest returnValue = new UserRest();

        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userDetails, userDto);

        UserDto createdUser = userService.createUser(userDto);
        BeanUtils.copyProperties(createdUser, returnValue);

        return returnValue;
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
