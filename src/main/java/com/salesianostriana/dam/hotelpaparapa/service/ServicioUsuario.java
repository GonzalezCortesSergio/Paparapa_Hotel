package com.salesianostriana.dam.hotelpaparapa.service;

import com.salesianostriana.dam.hotelpaparapa.model.Usuario;
import com.salesianostriana.dam.hotelpaparapa.repository.RepositorioUsuario;
import com.salesianostriana.dam.hotelpaparapa.service.base.ServicioBaseImpl;
import org.springframework.stereotype.Service;

@Service
public class ServicioUsuario extends ServicioBaseImpl<Usuario, Long, RepositorioUsuario> {

    public double calcularDescuentoUsuario(Usuario usuario) {

        double descuentoPorTresReservas = 0.05;
        double descuentoPremium = 0.25;

        boolean reservasParaDescuento = (usuario.getReservas().size() % 3 == 0);

        if (usuario.isPremium()) {
            if(reservasParaDescuento)
                return descuentoPremium + descuentoPorTresReservas;

            return descuentoPremium;
        }

        if (reservasParaDescuento)
            return descuentoPorTresReservas;


        return 0;
    }
}
