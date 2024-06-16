package com.example.demo;

import java.util.Base64;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EncodeController {

    @PostMapping("/encode")
    public String encode(@RequestParam String email, @RequestParam String code) {
        String toEncode = email + ":" + code;
        return Base64.getEncoder().encodeToString(toEncode.getBytes());
    }
}
