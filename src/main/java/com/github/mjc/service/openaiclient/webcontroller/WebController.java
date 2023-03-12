package com.github.mjc.service.openaiclient.webcontroller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Controller
@RequestMapping(value = "/web")
public class WebController {

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/wizard")
    public String wizard(){
        return "wizard";
    }
}
