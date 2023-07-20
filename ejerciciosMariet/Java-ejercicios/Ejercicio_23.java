import java.util.Scanner;
public class Ejercicio_23 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in) ;  
    int N1;
    System.out.print("Ingrese un numero: ");
    N1 = scanner.nextInt();
    boolean divisible = N1 % 14 == 0;

    System.out.println(N1 + " es " + (divisible ?" Divisible " : " No divisible " ) + "entre 14");

    scanner.close();

    }
}
