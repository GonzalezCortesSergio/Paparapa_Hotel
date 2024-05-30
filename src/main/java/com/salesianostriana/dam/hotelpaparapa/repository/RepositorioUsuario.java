package com.salesianostriana.dam.hotelpaparapa.repository;

import com.salesianostriana.dam.hotelpaparapa.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {
}
