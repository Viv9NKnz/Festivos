package com.example.holidayvalidator.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.holidayvalidator.model.Festivo;
import com.example.holidayvalidator.repository.FestivoRepository;

@Service
public class HolidayService {

    @Autowired
    private FestivoRepository festivoRepository;

    public boolean isHoliday(int dia, int mes) {
        Festivo festivo = festivoRepository.findByDiaAndMes(dia, mes);
        return festivo != null; // Si encuentra un festivo, retorna "Es un dia festivo"
    }

}

