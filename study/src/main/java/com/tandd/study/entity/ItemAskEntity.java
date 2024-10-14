package com.tandd.study.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "item_ask_tbl")
public class ItemAskEntity {

    @Id
    @Column(name = "iano")
    private String iaNo;

    @Column(name = "title", length = 100)
    private String title;

    @Column(name = "content", length = 1000)
    private String content;

    @Column(name = "writer", length = 100)
    private String writer;


}
