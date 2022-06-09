package com.example.SpringScope;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

import javax.servlet.http.HttpSession;

@RestController
@SessionScope
public class ControllerSessionScope {
    @GetMapping("SessionScope")
    public String getMessage(HttpSession session) {
        //open API in two different browser to see change session id and scope
        System.out.println(this + session.getId());
        return "Hello from SessionScopeController Session id: " + session.getId();
    }
}
