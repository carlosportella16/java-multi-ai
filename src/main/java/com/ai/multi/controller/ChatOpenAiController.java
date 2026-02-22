package com.ai.multi.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ChatOpenAiController {

    private final ChatClient openAiChatClient;

    public ChatOpenAiController(@Qualifier("openAiChatClient") ChatClient openAiChatClient) {
        this.openAiChatClient = openAiChatClient;
    }

    @GetMapping("/chat/openai")
    public String chat(@RequestParam("message") String message) {
        return openAiChatClient.prompt(message).call().content();
    }
}
