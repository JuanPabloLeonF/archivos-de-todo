import java.util.Scanner;

public class Ejercicio_21 {
      public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String Modelo;
        String Marca;
       

        System.out.println("Introduzca el Modelo: ");
        Modelo = scanner.nextLine();

        System.out.println("Introduzca la Marca: ");
        Marca = scanner.nextLine();

        System.out.println("Antes del intercambio A es igual a " + Modelo + "es igual a " + Marca);
        String X = Modelo;
        Modelo = Marca;
        Marca = X;
        
        System.out.println("La Marca es: " + Marca);

        System.out.println("El modelo es: " + Modelo);

        scanner.close();
      }
    }