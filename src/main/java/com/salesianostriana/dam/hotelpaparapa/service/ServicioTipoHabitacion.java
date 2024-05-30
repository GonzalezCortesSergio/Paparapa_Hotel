package com.salesianostriana.dam.hotelpaparapa.service;

import com.salesianostriana.dam.hotelpaparapa.model.TipoHabitacion;
import com.salesianostriana.dam.hotelpaparapa.repository.RepositorioTipoHabitacion;
import com.salesianostriana.dam.hotelpaparapa.service.base.ServicioBaseImpl;
import org.springframework.stereotype.Service;

@Service
public class ServicioTipoHabitacion extends ServicioBaseImpl<TipoHabitacion, Long, RepositorioTipoHabitacion> {
}
