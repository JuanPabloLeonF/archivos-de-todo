import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); {
            System.out.print("Ingrese la base del rectángulo: ");
            double base = scanner.nextDouble();

            System.out.print("Ingrese la altura del rectángulo: ");
            double altura = scanner.nextDouble();

            double perimetro = 2 * (base + altura);
            double area = base * altura;

            System.out.println("El perímetro del rectángulo es: " + perimetro);
            System.out.println("El área del rectángulo es: " + area);
            
            scanner.close();
        }
    }
}
