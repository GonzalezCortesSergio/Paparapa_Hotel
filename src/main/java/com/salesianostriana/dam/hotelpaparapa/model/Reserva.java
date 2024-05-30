package com.salesianostriana.dam.hotelpaparapa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Reserva {

    @EmbeddedId
    private ReservaPK reservaPK = new ReservaPK();


    @ManyToOne
    @MapsId("usuario_id")
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @MapsId("num_habitacion")
    @JoinColumn(name = "num_habitacion")
    private Habitacion habitacion;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate fechaLlegada;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate fechaSalida;

    private int numPersonas;

    @DateTimeFormat(pattern = "HH:mm")
    private LocalTime horaLlegada;

    @DateTimeFormat(pattern = "HH:mm")
    private LocalTime horaSalida;


    private double precioReserva;
}
