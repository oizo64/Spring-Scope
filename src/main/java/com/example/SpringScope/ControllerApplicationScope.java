package com.example.SpringScope;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.SessionScope;

import javax.servlet.http.HttpSession;

@RestController
@ApplicationScope
public class ControllerApplicationScope {
    @GetMapping("ApplicationScope")
    public String getMessage(HttpSession session) {
        System.out.println(this);
        return "Hello from ApplicationScopeController";
    }
}
