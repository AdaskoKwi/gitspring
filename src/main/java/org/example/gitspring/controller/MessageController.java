package org.example.gitspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @GetMapping("/check")
    public String getMessage() {
        return "Working";
    }
}
