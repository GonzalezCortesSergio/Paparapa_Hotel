package com.salesianostriana.dam.hotelpaparapa.model;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Embeddable
public class ReservaPK implements Serializable {

    private static final long serialVersionUID = 1L;

    private long usuario_id;
    private long num_habitacion;
}
