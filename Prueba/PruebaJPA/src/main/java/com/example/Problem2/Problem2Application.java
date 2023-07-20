package com.example.Problem2;

import com.example.Problem2.model.Jugador;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import jakarta.persistence.*;
import java.util.List;
import java.util.Scanner;


@SpringBootApplication
public class Problem2Application {

	private static EntityManagerFactory emf;
	private static EntityManager em;

	public static void main(String[] args) {
		SpringApplication.run(Problem2Application.class, args);

			emf = Persistence.createEntityManagerFactory("Jugador");
			em = emf.createEntityManager();
			Scanner scanner = new Scanner(System.in);
			int opcion; 

			do {
				mostrarMenu();
				opcion = scanner.nextInt();
				scanner.nextLine(); // Limpiar el buffer

				switch (opcion) {
					case 1:
						introducirDatos(scanner);
						break;
					case 2:
						imprimirInformacionJugador(scanner);
						break;
					case 3:
						listarPorSexo(scanner);
						break;
					case 4:
						listarPorEstatura(scanner);
						break;
					case 5:
						listarPorEdad(scanner);
						break;
					case 6:
						imprimirListadoCompleto();
						break;
					case 0:
						System.out.println("¡Hasta luego!");
						break;
					default:
						System.out.println("Opción inválida. Inténtalo de nuevo.");
						break;
				}
			} while (opcion != 0);

			em.close();
			emf.close();
		}

		private static void mostrarMenu() {
			System.out.println("----- Menú -----");
			System.out.println("1. Introducir datos interactivamente");
			System.out.println("2. Imprimir información de un jugador");
			System.out.println("3. Listado por sexo");
			System.out.println("4. Listado de jugadores por estatura");
			System.out.println("5. Listado de jugadores por edad");
			System.out.println("6. Imprimir listado completo de jugadores");
			System.out.println("0. Salir");
			System.out.print("Elige una opción: ");
		}

		private static void introducirDatos(Scanner scanner) {
			System.out.print("Ingrese el nombre del jugador: ");
			String nombre = scanner.nextLine();

			System.out.print("Ingrese la cédula del jugador: ");
			String cedula = scanner.nextLine();

			System.out.print("Ingrese la estatura del jugador: ");
			double estatura = scanner.nextDouble();

			System.out.print("Ingrese la edad del jugador: ");
			int edad = scanner.nextInt();
			scanner.nextLine(); // Limpiar el buffer

			System.out.print("Ingrese el sexo del jugador: ");
			String sexo = scanner.nextLine();

			Jugador jugador = new Jugador(nombre, cedula, estatura, edad, sexo);

			em.getTransaction().begin();
			em.persist(jugador);
			em.getTransaction().commit();

			System.out.println("Datos del jugador guardados exitosamente.");
		}

		private static void imprimirInformacionJugador(Scanner scanner) {
			System.out.print("Ingrese el ID del jugador: ");
			int id = scanner.nextInt();
			scanner.nextLine(); // Limpiar el buffer

			Jugador jugador = em.find(Jugador.class, id);

			if (jugador != null) {
				System.out.println("Información del jugador:");
				System.out.println("Nombre: " + jugador.getNombre());
				System.out.println("Cédula: " + jugador.getCedula());
				System.out.println("Estatura: " + jugador.getEstatura());
				System.out.println("Edad: " + jugador.getEdad());
				System.out.println("Sexo: " + jugador.getSexo());
			} else {
				System.out.println("No se encontró ningún jugador con el ID especificado.");
			}
		}

		private static void listarPorSexo(Scanner scanner) {
			System.out.print("Ingrese el sexo para filtrar (M/F): ");
			String sexo = scanner.nextLine();

			Query query = em.createQuery("SELECT j FROM Jugador j WHERE j.sexo = :sexo");
			query.setParameter("sexo", sexo);

			List<Jugador> jugadores = query.getResultList();

			if (!jugadores.isEmpty()) {
				System.out.println("Jugadores del sexo '" + sexo + "':");
				for (Jugador jugador : jugadores) {
					System.out.println("ID: " + jugador.getId() + ", Nombre: " + jugador.getNombre());
				}
			} else {
				System.out.println("No se encontraron jugadores del sexo especificado.");
			}
		}

		private static void listarPorEstatura(Scanner scanner) {
			System.out.print("Ingrese la estatura mínima: ");
			double estaturaMin = scanner.nextDouble();

			System.out.print("Ingrese la estatura máxima: ");
			double estaturaMax = scanner.nextDouble();
			scanner.nextLine(); // Limpiar el buffer

			Query query = em.createQuery("SELECT j FROM Jugador j WHERE j.estatura BETWEEN :estaturaMin AND :estaturaMax");
			query.setParameter("estaturaMin", estaturaMin);
			query.setParameter("estaturaMax", estaturaMax);

			List<Jugador> jugadores = query.getResultList();

			if (!jugadores.isEmpty()) {
				System.out.println("Jugadores con estatura entre " + estaturaMin + " y " + estaturaMax + ":");
				for (Jugador jugador : jugadores) {
					System.out.println("ID: " + jugador.getId() + ", Nombre: " + jugador.getNombre());
				}
			} else {
				System.out.println("No se encontraron jugadores dentro del rango de estaturas especificado.");
			}
		}

		private static void listarPorEdad(Scanner scanner) {
			System.out.print("Ingrese la edad mínima: ");
			int edadMin = scanner.nextInt();

			System.out.print("Ingrese la edad máxima: ");
			int edadMax = scanner.nextInt();
			scanner.nextLine(); // Limpiar el buffer

			Query query = em.createQuery("SELECT j FROM Jugador j WHERE j.edad BETWEEN :edadMin AND :edadMax");
			query.setParameter("edadMin", edadMin);
			query.setParameter("edadMax", edadMax);

			List<Jugador> jugadores = query.getResultList();

			if (!jugadores.isEmpty()) {
				System.out.println("Jugadores con edades entre " + edadMin + " y " + edadMax + ":");
				for (Jugador jugador : jugadores) {
					System.out.println("ID: " + jugador.getId() + ", Nombre: " + jugador.getNombre());
				}
			} else {
				System.out.println("No se encontraron jugadores dentro del rango de edades especificado.");
			}
		}

		private static void imprimirListadoCompleto() {
			Query query = em.createQuery("SELECT j FROM Jugador j");

			List<Jugador> jugadores = query.getResultList();

		if (!jugadores.isEmpty()) {
				System.out.println("Listado completo de jugadores:");
			for (Jugador jugador : jugadores) {
				System.out.println("ID: " + jugador.getId() + ", Nombre: " + jugador.getNombre() +
						", Cédula: " + jugador.getCedula() + ", Estatura: " + jugador.getEstatura() +
						", Edad: " + jugador.getEdad() + ", Sexo: " + jugador.getSexo());
			}
		} else {
			System.out.println("No se encontraron jugadores en la base de datos.");
		}
	}
}