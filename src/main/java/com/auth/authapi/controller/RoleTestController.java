package com.auth.authapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RoleTestController {

    @GetMapping("/user/data")
    public String userData() {
        return "Hello USER - You are authorized!";
    }

    @GetMapping("/admin/data")
    public String adminData() {
        return "Hello ADMIN - You are authorized!";
    }
}
