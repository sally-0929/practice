package com.tandd.study.service;

import com.tandd.study.dto.ItemDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService{

    @Override
    public Long register(ItemDTO itemDTO) {

        return 0L;
    }
}
