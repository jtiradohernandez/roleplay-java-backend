package com.ironhack.demosecurityjwt.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ironhack.demosecurityjwt.models.ChatModel;
import com.ironhack.demosecurityjwt.services.ChatService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/chat")
public class ChatController {

    @Autowired
    ChatService chatService;
    private final ObjectMapper objectMapper = new ObjectMapper();

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<ChatModel> getMessages() {
        return chatService.GetChatMessages();
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public ChatModel addMessage(@RequestBody @Valid ChatModel chatMessage) throws JsonProcessingException {
        return chatService.addMessage(chatMessage);
    }
}
