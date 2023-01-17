package com.example.homework62;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

@Controller
public class CustomController {
    @Autowired
    RequestBean requestBean;
    @Autowired
    SessionBean sessionBean;

    @GetMapping(value = "/scopes")
    public void testScopes(HttpServletResponse response) throws IOException {
        System.out.println("is called");
        response.getWriter().write("scope test");
    }

    @GetMapping
    public String home() {
        return "index";
    }

}
