package com.ai.multi.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ChatBedrockAiController {

    private final ChatClient bedrockAiChatClient;

    public ChatBedrockAiController(@Qualifier("bedrockAiChatClient") ChatClient bedrockAiChatClient) {
        this.bedrockAiChatClient = bedrockAiChatClient;
    }

    @GetMapping("/chat/bedrock")
    public String chat(@RequestParam("message") String message) {
        return bedrockAiChatClient.prompt(message).call().content();
    }
}
