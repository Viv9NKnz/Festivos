package com.example.holidayvalidator.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.holidayvalidator.service.HolidayService;




@RestController
@RequestMapping("/api")
public class HolidayController {

    @Autowired
    private HolidayService holidayService;

    @GetMapping("/is-holiday")
    
    
        public String isHoliday(@RequestParam("date") String date) {
            try {
                // Parsea la fecha
                String[] parts = date.split("-");
                int dia = Integer.parseInt(parts[2]);
                int mes = Integer.parseInt(parts[1]);
    
                boolean esFestivo = holidayService.isHoliday(dia, mes);
                return esFestivo ? "Es un día festivo" : "No es un día festivo";
            } catch (Exception e) {
                return "Fecha no válida";
            }
        }
}

// Profe espero espero que esta API Funcione como usted lo pidio, fueron bastantes horas haciendo esto :D