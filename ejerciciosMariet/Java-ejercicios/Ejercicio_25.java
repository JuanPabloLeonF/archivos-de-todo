import java.util.Scanner;
public class Ejercicio_25 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in) ;  
    int N1;
    System.out.print("Ingrese un numero: ");
    N1 = scanner.nextInt();
    boolean Multiplo = N1 % 2 == 0;

    System.out.println(N1 + " es " + (Multiplo ?" Par " : " Impar " ) );

    scanner.close();

    }
}