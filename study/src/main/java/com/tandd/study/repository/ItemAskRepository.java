package com.tandd.study.repository;

import com.tandd.study.entity.ItemAskEntity;
import com.tandd.study.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemAskRepository extends JpaRepository<ItemAskEntity, String> {
}
