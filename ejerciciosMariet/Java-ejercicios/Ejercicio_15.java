import java.util.Scanner;

public class Ejercicio_15 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int A;
        int B;
       

        System.out.println("Introduzca el número A: ");
        A = scanner.nextInt();

        System.out.println("Introduzca el número B: ");
        B = scanner.nextInt();

        System.out.println("Antes del intercambio A es igual a " + A + "es igual a " + B);
        int X = A;
        A = B;
        B = X;
        
        System.out.println("Ya intercambiado A es igual a: " + A);

        System.out.println("Ya intercambiado A es igual a: " + B);

        scanner.close();

    }
}
