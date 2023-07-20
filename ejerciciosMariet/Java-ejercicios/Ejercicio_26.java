import java.util.Scanner;
public class Ejercicio_26 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in) ;  
    int N1;
    int N2;

    System.out.print("Ingrese un numero: ");
    N1 = scanner.nextInt();
    System.out.print("Ingrese otro numero: ");
    N2 = scanner.nextInt();

    int suma = N1 + N2;

    if (suma == 0) {

    System.out.println("La suma es igual a 0");
    }

    else if (suma > 0) {

        System.out.println("La suma: " + suma + " es positiva");
        }

        else if (suma < 0) {

            System.out.println("La suma: " + suma + " es negativa");
            }    
    scanner.close();
    }
}