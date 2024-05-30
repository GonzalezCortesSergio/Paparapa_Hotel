package com.salesianostriana.dam.hotelpaparapa.service;

import com.salesianostriana.dam.hotelpaparapa.model.Reserva;
import com.salesianostriana.dam.hotelpaparapa.model.ReservaPK;
import com.salesianostriana.dam.hotelpaparapa.repository.RepositorioReserva;
import com.salesianostriana.dam.hotelpaparapa.service.base.ServicioBaseImpl;
import org.springframework.stereotype.Service;

@Service
public class ServicioReserva extends ServicioBaseImpl<Reserva, ReservaPK, RepositorioReserva> {
}
