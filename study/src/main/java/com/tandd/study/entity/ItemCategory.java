package com.tandd.study.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "item_category_tbl")
@Data
public class ItemCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cid;

    @Column(name = "cname", nullable = false, length = 100)
    private String cName;

    @Column(name = "c_desc", nullable = false, length = 100)
    private String cDesc;

}
