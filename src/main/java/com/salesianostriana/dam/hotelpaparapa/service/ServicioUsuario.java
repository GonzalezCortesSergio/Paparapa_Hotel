package com.salesianostriana.dam.hotelpaparapa.service;

import com.salesianostriana.dam.hotelpaparapa.model.Usuario;
import com.salesianostriana.dam.hotelpaparapa.repository.RepositorioUsuario;
import com.salesianostriana.dam.hotelpaparapa.service.base.ServicioBaseImpl;
import org.springframework.stereotype.Service;

@Service
public class ServicioUsuario extends ServicioBaseImpl<Usuario, Long, RepositorioUsuario> {
}
