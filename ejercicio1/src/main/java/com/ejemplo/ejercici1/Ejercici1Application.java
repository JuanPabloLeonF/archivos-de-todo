package com.ejemplo.ejercici1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejercici1Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejercici1Application.class, args);

		Suma operacion1 = new Suma();

		int resultado = operacion1.sumar(1,3);

		System.out.println(resultado);
	}
}
