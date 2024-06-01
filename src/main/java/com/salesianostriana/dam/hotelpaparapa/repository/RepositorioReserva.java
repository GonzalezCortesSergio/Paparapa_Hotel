package com.salesianostriana.dam.hotelpaparapa.repository;

import com.salesianostriana.dam.hotelpaparapa.model.Reserva;
import com.salesianostriana.dam.hotelpaparapa.model.ReservaPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;

public interface RepositorioReserva extends JpaRepository<Reserva, ReservaPK> {

    @Query("""
            SELECT r
            FROM Reserva r
            WHERE r.habitacion.numHabitacion = :numHabitacion AND r.fechaLlegada = :fechaEntrada
            """)
    Reserva reservaFechaEntrada(@Param("fechaEntrada")LocalDate fechaEntrada, @Param("numHabitacion") long numHabitacion);
}
