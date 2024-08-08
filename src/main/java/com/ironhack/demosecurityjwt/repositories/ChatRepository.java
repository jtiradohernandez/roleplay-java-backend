package com.ironhack.demosecurityjwt.repositories;

import com.ironhack.demosecurityjwt.models.ChatModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepository extends JpaRepository<ChatModel, String> {
}
