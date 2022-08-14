package com.myntra.controller;

import com.myntra.model.entity.ClothingItem;
import com.myntra.service.ClothingItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ActuallRestController {

    @Autowired
    private ClothingItemService service;

    @PostMapping(path="/api/v1/cloths/add")
    public String addClothingItem(@RequestBody ClothingItem item) {
        // check thetoken
        var token = headers.getHeader("Cotent-Type");
        System.out.println("got the request inside addClothing");

        service.addItem(item);
        return "Item added successfully!";
    }

    @GetMapping(path="/api/v1/cloths/")
    public List<ClothingItem> getAllItems() {
        System.out.println("got the request inside get all");

        return service.getAllItems();
    }

}
