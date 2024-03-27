package com.francodavyd;

import com.francodavyd.model.Usuario;
import com.francodavyd.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PruebaSpringSqliteApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebaSpringSqliteApplication.class, args);
	}

	@Autowired
	 private IUsuarioRepository repository;
	@Bean
	CommandLineRunner commandLineRunner(){
		return args -> {
			repository.findAll().forEach(usuario ->{
				System.out.println(usuario.getName());
			} );
		};
	}
}
