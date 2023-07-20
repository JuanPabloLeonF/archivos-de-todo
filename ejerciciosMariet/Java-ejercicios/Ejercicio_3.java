import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); {
            System.out.print("Ingrese la longitud del primer cateto: ");
            double cateto1 = scanner.nextDouble();

            System.out.print("Ingrese la longitud del segundo cateto: ");
            double cateto2 = scanner.nextDouble();

            double hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);

            System.out.println("La hipotenusa es: " + hipotenusa);

            scanner.close();
        }
    }
}
