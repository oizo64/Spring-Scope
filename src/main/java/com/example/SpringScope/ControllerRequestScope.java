package com.example.SpringScope;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@RequestScope
public class ControllerRequestScope {
    @GetMapping("RequestScope")
    public String getMessage() {
        System.out.println(this);
        return "Hello from RequestScopeController";
    }
}
