import java.util.Scanner;

public class Ejercicio_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); {
            System.out.print("Ingrese la temperatura en grados Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();

            double celsius = (fahrenheit - 32) * 5 / 9;

            System.out.println("La temperatura en grados Celsius es: " + celsius);

            scanner.close();
        }
    }
}
