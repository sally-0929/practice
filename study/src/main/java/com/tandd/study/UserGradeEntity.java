package com.tandd.study;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "user_grade_tbl")
@Data
@NoArgsConstructor
@ToString
public class UserGradeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ugid")
    private Long ugId;

    @Enumerated(EnumType.STRING)
    @Column(name = "ugname", nullable = false)
    private UserGradeName ugName;

    @Column(name = "ug_desc", length = 100)
    private String ugDesc;

}
