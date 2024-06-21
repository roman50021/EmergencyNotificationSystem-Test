﻿package com.eurekabegin.eurekaclient.controller;

import com.eurekabegin.eurekaclient.bot.Bot;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Update;

@RestController
@RequiredArgsConstructor
public class MainController {
    private final Bot bot;

    @PostMapping
    public BotApiMethod<?> listener(@RequestBody Update update){
        return bot.onWebhookUpdateReceived(update);
    }
}
