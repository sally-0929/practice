package com.tandd.study.entity;

import com.tandd.study.status.ItemStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;


@Entity
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "item_tbl")
public class ItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_no")
    private Long iNo;

    @Column(name = "item_name", nullable = false)
    private String iName;

    @Column(name = "item_desc", nullable = false)
    private String iDesc;

    @Column(name = "start_price", nullable = false)
    private Long startPrice;

    @Column(name = "max_price", nullable = false)
    private Long maxPrice;

    @Column(nullable = false)
    private Date regDate;

    @Column(nullable = false)
    private Date modDate;

    @Enumerated(EnumType.STRING)
    private ItemStatus itemStatus;

}
