package com.example.oauthserver.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by weiyuan on 2019/8/20/020.
 */
@Controller
@Slf4j
public class LoginController {

    @GetMapping("/login")
    public String login() {
        log.info("----------login---------");

        return "login";
    }
    @GetMapping("/hello")
    public  String hello() {
        return "hello";
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/exit")
    public void exit(HttpServletRequest request, HttpServletResponse response) {
        new SecurityContextLogoutHandler().logout(request, null, null);
        try {
            System.out.println(request.getHeader("referer"));
            response.sendRedirect(request.getHeader("referer"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
