package ru.skypro.basket.service;

import org.springframework.stereotype.Service;
import ru.skypro.basket.model.Basket;

@Service
public class BascetService {
    private final Basket basket ;

    public BascetService(Basket basket) {
        this.basket = basket;
    }
}
