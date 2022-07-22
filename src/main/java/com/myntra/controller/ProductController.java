package com.myntra.controller;

import com.myntra.model.dao.ClothingItemDao;
import com.myntra.model.entity.ClothingItem;
import com.myntra.service.ClothingItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * MVC
 *  Controller => bind the Model and View
 *
 *     spring configareation can be done 3 ways
 *      1.  XMl based configuration
 *      2. annotations
 *      3. java object
 *
 *      MVC -> View -> HTML
 *      REST/SOAP -> JSON/XML
 */
@Controller
public class ProductController {
    private String name = "Welcome To World Most Popular Fashion Store";

    @Autowired
    private ClothingItemService serviceObj;

    @RequestMapping(value = "/myntra-products")
    public String sendName(Model m) {
        long id = 0;
//        ClothingItem c = serviceObj.findById(id).get();

        List<ClothingItem> products = serviceObj.getAllItems();

        System.out.println(serviceObj.getAllItems());

//        m.addAttribute("type", c.getType());
//        m.addAttribute("size", c.getSize());
//        m.addAttribute("price", c.getPrice());
//        m.addAttribute("quantity", c.getQuantity());
//        m.addAttribute("img", c.getImgUrl());

        m.addAttribute("products", products);

        return "myntra-products";
    }

//    private List<ClothingItem> getItems() {
//        return List.of(serviceObj.getAllItems())
//    }

}
