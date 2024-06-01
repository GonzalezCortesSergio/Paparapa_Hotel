package com.salesianostriana.dam.hotelpaparapa.controller;

import com.salesianostriana.dam.hotelpaparapa.service.ServicioHabitacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorHabitacion {

    @Autowired
    private ServicioHabitacion servicioHabitacion;



    @GetMapping("/habitaciones")
    public String mostrarHabitaciones(Model model) {

        model.addAttribute("habitaciones", servicioHabitacion.findAll());

        return "habitaciones";
    }


    @GetMapping({"/", "/index"})
    public String index(Model model) {

        model.addAttribute("habitaciones", servicioHabitacion.tresHabitaciones());

        return "index";
    }
}
