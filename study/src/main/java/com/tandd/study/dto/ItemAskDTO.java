package com.tandd.study.dto;

import com.tandd.study.entity.ItemAskEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;

import java.util.Date;

@Data
public class ItemAskDTO {

    private String iaNo;
    private String title;
    private String content;
    private String writer;

    public ItemAskEntity DtotoEntity(ItemAskDTO dto){
        this.iaNo = dto.iaNo;
        this.title = dto.title;
        this.content =
    }

}
