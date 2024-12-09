package ru.skypro.basket.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
@RequestMapping("/store/order")
@RestController
public class BasketController {
    @GetMapping("/add")

    public void add(@RequestParam ("ids")List<Integer> ids) {
        System.out.println("IDS -" + ids);
    }

    @GetMapping("/get")
    public List<Integer> get(){
        return null;
    } //название переменной неважно при возврате данных

}
