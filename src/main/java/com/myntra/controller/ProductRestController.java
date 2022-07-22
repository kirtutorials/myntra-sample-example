package com.myntra.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class ProductRestController {
    List<String> items = List.of("Shirts", "Pants", "T-Shirts", "Hats", "Coats");

    @RequestMapping(path = "/api/v1/products/all", method = RequestMethod.GET)
    public List<String> sendAllProducts() {
        return items;
    }

    @GetMapping(path = "api/v1/products/")
    public String getDataBasedOnQueryParams(@RequestParam Map<String, String> allReqParams) {
        System.out.println(allReqParams);
        return "data";
    }
//
//
//    @RequestMapping(path = "/api/v1/products/add", method = RequestMethod.POST)
//    public String addSingleProduct(@RequestBody String value) {
//        System.out.println("inside Add SinglePRoduct: " + value);
//        items.add(value.toString());
//        return "Product added successfully!";
//    }
//
//    @RequestMapping(path = "/api/v1/products/{id}", method = RequestMethod.DELETE)
//    public String deleteProduct(@RequestParam) {
//        System.out.println("inside Add SinglePRoduct: ");
////        items.remove(id);
//        return "Product successfully deleted!";
//    }

}
