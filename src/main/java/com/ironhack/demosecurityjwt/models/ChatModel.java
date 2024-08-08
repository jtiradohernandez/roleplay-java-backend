package com.ironhack.demosecurityjwt.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class ChatModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "Message cannot be empty")
    private String message;

    @OneToOne
    @JoinColumn(name="user_id")
    private User user;

    @Version
    private Timestamp time;

    public ChatModel(String message, User user) {
        this.message = message;
        this.user = user;
    }
}
