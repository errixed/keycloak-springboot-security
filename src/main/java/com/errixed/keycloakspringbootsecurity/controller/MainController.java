package com.errixed.keycloakspringbootsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

@RestController
public class MainController {

    @GetMapping("/")
    public String hello() {
        return "home page";
    }

    @GetMapping("/employees")
    public String getEmployees() {
        return "name: employee 1";
    }

    @GetMapping("/departments")
    public String getDeparts() {
        return "name: department 1";
    }

    @GetMapping("/logout")
    public RedirectView logout(HttpServletRequest request) throws ServletException {
        request.logout();
        return new RedirectView("http://localhost:8080/");
    }

    @GetMapping("/access-denied-response")
    public String accessDenied() {
        return "Access Denied... You don't have permission.";
    }
}
