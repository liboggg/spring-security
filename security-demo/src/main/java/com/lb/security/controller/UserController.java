package com.lb.security.controller;

import com.lb.security.dto.User;
import com.lb.security.dto.UserQueryCondition;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author libog
 */
@RestController
public class UserController {

    @GetMapping("/user")
    public List<User> query(UserQueryCondition condition) {
        System.out.println(condition);
        int age = condition.getAge();
        List<User> data = new ArrayList<>();
        data.add(new User());
        data.add(new User());
        data.add(new User());
        return data;
    }
}
