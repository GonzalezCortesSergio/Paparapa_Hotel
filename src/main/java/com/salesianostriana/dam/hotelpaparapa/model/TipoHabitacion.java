package com.salesianostriana.dam.hotelpaparapa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TipoHabitacion {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String nombre;

    private double precioPorNoche;
}
