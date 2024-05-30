package com.salesianostriana.dam.hotelpaparapa.repository;

import com.salesianostriana.dam.hotelpaparapa.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findFirstByUsername(String username);
}
