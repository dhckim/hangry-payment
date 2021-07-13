package com.dk.hangrypayment.controlleer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HangryPaymentController {

    @GetMapping("/")
    String hello() {
        return "Hello!";
    }
}
