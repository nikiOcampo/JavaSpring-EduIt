package com.desafio3.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio3.modelo.Usuario;
@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario,Integer> {

}
