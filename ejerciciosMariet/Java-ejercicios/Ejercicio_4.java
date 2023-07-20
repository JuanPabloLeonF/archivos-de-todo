import java.util.Scanner;

public class Ejercicio_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); {
            System.out.print("Digite el primer número: ");
            double numero1 = scanner.nextDouble();

            System.out.print("Digite el segundo número: ");
            double numero2 = scanner.nextDouble();

            double suma = numero1 + numero2;
            double resta = numero1 - numero2;
            double multiplicacion = numero1 * numero2;
            double division = numero1 / numero2;

            System.out.println("La suma es: " + suma);
            System.out.println("La resta es: " + resta);
            System.out.println("La multiplicación es: " + multiplicacion);
            System.out.println("La división es: " + division);

            scanner.close();
        }
    }
}
