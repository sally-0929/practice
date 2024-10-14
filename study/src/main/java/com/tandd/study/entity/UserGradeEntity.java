package com.tandd.study.entity;


import com.tandd.study.status.UserGradeName;
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
    @Column(name = "ug_id")
    private Long ugId;

    @Enumerated(EnumType.STRING)
    @Column(name = "ug_name", nullable = false)
    private UserGradeName ugName;

    @Column(name = "ug_desc", length = 100)
    private String ugDesc;

}
