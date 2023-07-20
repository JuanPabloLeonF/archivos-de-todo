import java.util.Scanner;

public class Ejercicio_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int num1;
        int num2;
        int distancia;

        System.out.println("Introduce el primer número");
        num1 = scanner.nextInt();
        
        System.out.println("Introduce el segundo número");
        num2 = scanner.nextInt();

        distancia = Math.abs (num1 - num2);

        System.out.println("La distancia entre ambos números es: " + distancia);
        

        scanner.close();

    }
}
