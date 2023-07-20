import java.util.Scanner;

public class Ejercicio_13 { 

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in) ;

        double num1;
        double rCuadrada;
        double rCubica;

        System.out.println("Introduzca el número que desea calcular");
        num1 = scanner.nextInt();

        rCubica = Math.pow(num1, (double) 1/3 );
        rCuadrada = Math.sqrt(num1);
    

        System.out.println("La raiz  cubica es " + rCubica + " y la raiz cuadrada es " + rCuadrada);

        scanner.close();
    }
    
}
