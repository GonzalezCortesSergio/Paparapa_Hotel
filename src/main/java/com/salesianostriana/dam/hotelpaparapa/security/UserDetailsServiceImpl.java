package com.salesianostriana.dam.hotelpaparapa.security;

import com.salesianostriana.dam.hotelpaparapa.repository.RepositorioUsuario;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {


    private final RepositorioUsuario repositorioUsuario;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repositorioUsuario.findFirstByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("Error al buscar el usuario"));
    }
}
