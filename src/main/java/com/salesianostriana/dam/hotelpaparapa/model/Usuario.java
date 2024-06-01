package com.salesianostriana.dam.hotelpaparapa.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Usuario implements UserDetails {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private String apellidos;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String username;

    private String password;

    private boolean admin;

    private boolean premium;


    @OneToMany(mappedBy = "usuario", fetch = FetchType.EAGER)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<Reserva> reservas = new ArrayList<>();


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        String role = "ROLE_";

        role += (admin) ? "ADMIN" : "CLIENTE";


        return List.of(new SimpleGrantedAuthority(role));
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
