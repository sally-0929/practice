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
    private Long I_no;

    @Column(nullable = false)
    private String I_name;

    @Column(nullable = false)
    private String I_desc;

    @Column(nullable = false)
    private Long start_price;

    @Column(nullable = false, name = "max_price")
    private Long maxPrice;

    @Column(nullable = false)
    private Date regdate;

    @Column(nullable = false)
    private Date moddate;

    @Enumerated(EnumType.STRING)
    private ItemStatus itemStatus;

}
