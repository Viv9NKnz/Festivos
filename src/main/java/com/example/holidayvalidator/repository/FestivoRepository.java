package com.example.holidayvalidator.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.holidayvalidator.model.Festivo;

public interface FestivoRepository extends JpaRepository<Festivo, Long> {
    Festivo findByDiaAndMes(Integer dia, Integer mes);

}