package com.ai.multi.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ChatDockerAiController {

    private final ChatClient chatClient;

    public ChatDockerAiController(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder.build();
    }

    @GetMapping("/chat/docker")
    public String chat(@RequestParam("message") String message) {
        return chatClient.prompt(message).call().content();
    }
}
