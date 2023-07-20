import java.util.Scanner;

public class Ejercicio_12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int X1;
        int X2;
        int Y1;
        int Y2;
        int distancia1;
        int distancia2;
        
        System.out.println("Introduzca la variable X1");
        X1 = scanner.nextInt();

        System.out.println("Introduzca la variable Y1");
        Y1 = scanner.nextInt();

        System.out.println("Introduzca la variable X2");
        X2 = scanner.nextInt();

        System.out.println("Introduzca la variable Y2");
        Y2 = scanner.nextInt(); 

        distancia1 = Math.abs (X1 - Y1);
        distancia2 = Math.abs (X2 - Y2);

        System.out.println("La distancia entre X1 y Y1 es de " + distancia1 + " y la distancia entre X2 y Y2 es de " + distancia2);
    
        scanner.close();

    }   
    
}
