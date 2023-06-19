package com.example.exceptionhandler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {



    @GetMapping("/login")
    public String userIdCheck(@RequestParam("id") String id, @RequestParam("password") String password) {
        if (!(id.equals("user01") && password.equals("pass01"))) {
            // 불일치 할 경우 InvalidCredentialsException 발생
            throw new InvalidCredentialsException("401 error : 유효한 자격 증명 없음");
        }

        return "redirect:/main";
    }


}
