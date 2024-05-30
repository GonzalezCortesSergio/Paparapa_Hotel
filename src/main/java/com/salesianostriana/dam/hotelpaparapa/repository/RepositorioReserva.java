package com.salesianostriana.dam.hotelpaparapa.repository;

import com.salesianostriana.dam.hotelpaparapa.model.Reserva;
import com.salesianostriana.dam.hotelpaparapa.model.ReservaPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioReserva extends JpaRepository<Reserva, ReservaPK> {
}
