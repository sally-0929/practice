package com.tandd.study.repository;

import com.tandd.study.entity.UserGradeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserGradeRepository extends JpaRepository<UserGradeEntity, Long> {

}
