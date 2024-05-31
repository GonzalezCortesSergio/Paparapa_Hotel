package com.salesianostriana.dam.hotelpaparapa.repository;

import com.salesianostriana.dam.hotelpaparapa.model.Reserva;
import com.salesianostriana.dam.hotelpaparapa.model.ReservaPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.Optional;

public interface RepositorioReserva extends JpaRepository<Reserva, ReservaPK> {

    @Query("""
            SELECT r
            FROM Reserva r
            WHERE r.id = :idResera AND r.fechaLlegada = :fechaEntrada
            """)
    Optional<Reserva> reservaFechaEntrada(@Param("fechaEntrada")LocalDate fechaEntrada, @Param("idReserva") long idReserva);
}
