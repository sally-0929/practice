package com.tandd.study.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserGradeDTO {

    private Long ugId;
    private String ugName;
    private String ugDesc;
}
