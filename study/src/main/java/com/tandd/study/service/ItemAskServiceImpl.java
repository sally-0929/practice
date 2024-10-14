package com.tandd.study.service;

import com.tandd.study.dto.ItemAskDTO;
import com.tandd.study.dto.ItemDTO;
import com.tandd.study.entity.ItemAskEntity;
import com.tandd.study.repository.ItemAskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemAskServiceImpl implements ItemAskService{


    private final ItemAskRepository itemAskRepository;

    @Autowired
    ItemAskEntity itemAskEntity;

    @Override
    public void Register(ItemAskDTO itemAskDTO) {

        itemAskRepository.save(itemAskEntity);
    }

}
