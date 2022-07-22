package com.myntra.service;

import com.myntra.model.dao.ClothingItemDao;
import com.myntra.model.entity.ClothingItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClothingItemService {
    @Autowired
    ClothingItemDao dao;

    public void addItem(ClothingItem c) {
        dao.save(c);
    }

    public void deleteItem(long id) {
        dao.deleteById(id);
    }

    public List<ClothingItem> getAllItems() {

        List<ClothingItem> items= (List)dao.findAll();
        return items;
    }

}
