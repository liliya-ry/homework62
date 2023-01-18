package com.example.homework62.scope;

import com.example.homework62.scope.RequestBean;
import com.example.homework62.scope.SessionBean;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
public class CustomController {
    @Resource(name = "requestScopedBean")
    RequestBean requestBean;
    @Resource(name = "sessionScopedBean")
    SessionBean sessionBean;
    @Resource(name = "applicationScopedBean")
    ApplicationBean applicationBean;

    @RequestMapping("/scopes/request")
    public String getRequestScopeMsg(final Model model) {
        model.addAttribute("previousMessage", requestBean.message);
        requestBean.message = "Good morning!";
        model.addAttribute("currentMessage", requestBean.message);
        return "scopes";
    }

    @RequestMapping("/scopes/session")
    public String getSessionScopeMsg(final Model model) {
        model.addAttribute("previousMessage", sessionBean.message);
        sessionBean.message = "Good afternoon!";
        model.addAttribute("currentMessage", sessionBean.message);
        return "scopes";
    }

    @RequestMapping("/scopes/application")
    public String getApplicationScopeMsg(final Model model) {
        model.addAttribute("previousMessage", applicationBean.message);
        applicationBean.message = "Good afternoon!";
        model.addAttribute("currentMessage", applicationBean.message);
        return "scopes";
    }
}
