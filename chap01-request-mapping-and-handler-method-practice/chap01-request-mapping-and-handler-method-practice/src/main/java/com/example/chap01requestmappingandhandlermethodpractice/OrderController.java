package com.example.chap01requestmappingandhandlermethodpractice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.Date;

@Controller
public class OrderController {

    @PostMapping("orders")
    public String view(@ModelAttribute("order") OrderDTO order){
        Date date = new Date();
        order.setDate(date);
        return "confirm";
    }
}
