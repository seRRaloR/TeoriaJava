package com.jrla.teoriajava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jrla.teoriajava.services.NonWebService;

@SpringBootApplication
public class TeoriaJavaSpringApplication implements CommandLineRunner {

	@Autowired
	private NonWebService servicio;

	public static void main(String[] args) {
		SpringApplication.run(TeoriaJavaSpringApplication.class, args);
	}
	
	// Un parámetro seguido de 3 puntos indica un número arbitrario de argumentos (de 0 a n)
	@Override
	public void run(String... args) throws Exception {
		servicio.mensajeInicial(args);
	}

}
