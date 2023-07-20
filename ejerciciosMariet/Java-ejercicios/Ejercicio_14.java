import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {
        
        int invertido = 0;
        int num1;
        int resto;

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduzca el número de minimo 2 cifras: ");
        num1 = scanner.nextInt();

        while(num1 > 0 ) {
            resto = num1 % 10;
            invertido = invertido * 10 + resto;
            num1 /= 10;

        }

        System.out.print("El número invertido es " + invertido);



        scanner.close();

    }
    
}
