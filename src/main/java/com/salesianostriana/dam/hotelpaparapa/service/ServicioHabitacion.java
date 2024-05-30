package com.salesianostriana.dam.hotelpaparapa.service;

import com.salesianostriana.dam.hotelpaparapa.model.Habitacion;
import com.salesianostriana.dam.hotelpaparapa.repository.RepositorioHabitacion;
import com.salesianostriana.dam.hotelpaparapa.service.base.ServicioBaseImpl;
import org.springframework.stereotype.Service;

@Service
public class ServicioHabitacion extends ServicioBaseImpl<Habitacion, Long, RepositorioHabitacion> {
}
