package com.example.demo;

import java.util.Base64;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EncodeController {

    @PostMapping("/encode")
    public String encodeEmailCode(@RequestParam String email, @RequestParam String code) {
        // Создаем строку формата email:code
        String combinedString = email + ":" + code;
        
        // Кодируем строку в BASE64
        String encodedString = Base64.getEncoder().encodeToString(combinedString.getBytes());
        
        return encodedString;
    }
}