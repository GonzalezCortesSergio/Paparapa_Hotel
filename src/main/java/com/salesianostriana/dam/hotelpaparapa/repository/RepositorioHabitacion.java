package com.salesianostriana.dam.hotelpaparapa.repository;

import com.salesianostriana.dam.hotelpaparapa.model.Habitacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RepositorioHabitacion extends JpaRepository<Habitacion, Long> {

    @Query("""
            SELECT h
            FROM Habitacion h
            ORDER BY h.numHabitacion
            LIMIT 3
            """)
    List<Habitacion> tresHabitaciones();
}
