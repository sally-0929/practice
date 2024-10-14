package com.tandd.study.repository;

import com.tandd.study.entity.ItemCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemCategoryRepository extends JpaRepository<ItemCategory, Long> {
}
