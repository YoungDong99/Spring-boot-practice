package com.example.chap01requestmappingandhandlermethodpractice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/*")
@SessionAttributes("id")
public class MainController {

    @PostMapping("main")
    public String login(HttpSession session, String id) {
        session.setAttribute("id", id);

        return "main";
    }
}
