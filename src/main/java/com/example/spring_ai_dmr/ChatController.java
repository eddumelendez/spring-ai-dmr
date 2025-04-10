package com.example.spring_ai_dmr;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class ChatController {

    private final ChatClient chatClient;

    public ChatController(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder.build();
    }

    @GetMapping("/chat")
    public String chat(@RequestParam String message) {
        return this.chatClient.prompt()
                .user(message)
                .call()
                .content();
    }

    @GetMapping("/chat-stream")
    public Flux<String> chatStream(@RequestParam String message) {
        return this.chatClient.prompt()
                .user(message)
                .stream()
                .content();
    }
    
    @GetMapping("/stocks")
    public String stocks(@RequestParam String message) {
        return this.chatClient.prompt()
                .user(message)
                .tools("stockFunction")
                .call()
                .content();
    }

}
