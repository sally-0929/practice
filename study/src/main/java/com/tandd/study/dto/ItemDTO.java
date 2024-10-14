package com.tandd.study.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ItemDTO {

    private Long I_no;

    private String I_name;

    private String I_desc;

    private Long start_price;

    private Long max_price;

    private Date regdate;

    private Date moddate;
}
