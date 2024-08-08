package com.ironhack.demosecurityjwt.services;

import com.ironhack.demosecurityjwt.models.ChatModel;
import com.ironhack.demosecurityjwt.repositories.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatService {
    @Autowired
    private ChatRepository chatRepository;
    public List<ChatModel> GetChatMessages() {
            return chatRepository.findAll();
    }

    public ChatModel addMessage(ChatModel chatMessage){
        return chatRepository.save(chatMessage);
    }
}
