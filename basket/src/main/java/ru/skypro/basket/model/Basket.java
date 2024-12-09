package ru.skypro.basket.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Component
public class Basket {
    private final List<Integer> products;
    public Basket () {
        this.products = new ArrayList<>();
    }
   public void addElements (List<Integer>elements) {
        products.addAll(elements);
   }

    public List<Integer> getAllElements() {
        return Collections.unmodifiableList(products);
    }

}
