package com.jrla.teoriajava.services;

import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class NonWebService {

	public void mensajeInicial(String[] argumentos) {
		System.out.println("Inicio de la aplicación....");
		
		// Expresión Lambda
		Arrays.stream(argumentos).forEach((elemento) -> System.out.println(elemento));
		
		// Operador doble dos puntos (::) equivalente a lambda
		Arrays.stream(argumentos).forEach(System.out::println);
	}
}
