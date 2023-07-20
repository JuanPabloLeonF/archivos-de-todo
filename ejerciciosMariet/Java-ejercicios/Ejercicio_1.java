import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); {
            System.out.print("¿Digite su nombre? ");
            String nombre = scanner.nextLine();

            System.out.println("¡Saludos " + nombre + "!");
          
            scanner.close();
        }   
    }
}
