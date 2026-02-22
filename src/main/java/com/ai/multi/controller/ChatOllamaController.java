package com.ai.multi.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ChatOllamaController {

    private final ChatClient ollamaChatClient;

    public ChatOllamaController(@Qualifier("ollamaChatClient") ChatClient ollamaChatClient) {
        this.ollamaChatClient = ollamaChatClient;
    }

    @GetMapping("/chat/ollama")
    public String chat(@RequestParam("message") String message) {
        return ollamaChatClient.prompt(message).call().content();
    }
}
