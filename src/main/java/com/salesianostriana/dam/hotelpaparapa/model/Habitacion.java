package com.salesianostriana.dam.hotelpaparapa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Habitacion {

    @Id
    @GeneratedValue
    private Long numHabitacion;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_habitacion_tipo_habitacion"))
    private TipoHabitacion tipo;

    private int planta;

    private int numCamas;



}
