package com.example.shoh_chat.controller;

import netscape.security.Principal;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/chat")
public class ChatController {
    @PostMapping(path = "/send")
    public ResponseEntity<Object> sendChat(String msg, Principal principal)
    {
        Object obj = new Object();
        return new ResponseEntity(obj,HttpStatus.OK);
    }
}
