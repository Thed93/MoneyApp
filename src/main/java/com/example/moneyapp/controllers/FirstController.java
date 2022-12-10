package com.example.moneyapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping
    public String helloWorld() {
        return "Приложение запущено";
    }
    @GetMapping("/info")
    public String info() {
        return "Евгений Зинченко" + "\n" + "MoneyApp" + "\n" +"12.12.2022" + "\n" + "Первое приложение";
    }
}
