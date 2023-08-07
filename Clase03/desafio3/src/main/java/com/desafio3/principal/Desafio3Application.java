package com.desafio3.principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.desafio3.modelo.Usuario;
import com.desafio3.repositorio.UsuarioRepositorio;

@SpringBootApplication
@ComponentScan("com.desafio3")
@EntityScan("com.desafio3")
@EnableJpaRepositories("com.desafio3")
public class Desafio3Application implements CommandLineRunner {
	@Autowired
	private UsuarioRepositorio ur;
	

	public static void main(String[] args) {
		SpringApplication.run(Desafio3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Usuario usuario1 = new Usuario("Fulano","Cabrera","fu@correo.com");
		this.ur.save(usuario1);
		Usuario usuario2 = new Usuario("Ana","Acosta","aa@correo.com");
		this.ur.save(usuario2);
		Usuario usuario3 = new Usuario("Juan","Canti","jj@correo.com");
		this.ur.save(usuario3);
	
	}

}
