import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la calificación del primer parcial: ");
        double parcial1 = scanner.nextDouble();

        System.out.print("Ingrese la calificación del segundo parcial: ");
        double parcial2 = scanner.nextDouble();

        System.out.print("Ingrese la calificación del tercer parcial: ");
        double parcial3 = scanner.nextDouble();

        System.out.print("Ingrese la calificación del examen final: ");
        double examenFinal = scanner.nextDouble();

        System.out.print("Ingrese la calificación del proyecto final: ");
        double proyectoFinal = scanner.nextDouble();

        double calificacionFinal = (parcial1 + parcial2 + parcial3) / 3 * 0.55 + examenFinal * 0.3 + proyectoFinal * 0.15;

        System.out.println("La calificación final es: " + calificacionFinal);

        scanner.close();
    }
}
