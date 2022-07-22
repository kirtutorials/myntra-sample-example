package com.myntra.model.dao;

import com.myntra.model.entity.ClothingItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ClothingItemDao extends CrudRepository<ClothingItem, Long> {
}
