package com.hirupos.demo.controller;

import com.hirupos.demo.dto.UserDTO;
import com.hirupos.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api")
@CrossOrigin

public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getData/{category}")
    public  List<UserDTO> getUserByUserName(@PathVariable String category){
        System.out.println(category);
        return userService.getDataByCategory(category);

    }
}
