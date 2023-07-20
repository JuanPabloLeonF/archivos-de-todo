import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cantidad de minutos: ");
        int minutos = scanner.nextInt();

        int horas = minutos / 60;
        int minutosRestantes = minutos % 60;

        System.out.printf(minutos + " minutos equivalen a " + horas + " horas y " + minutosRestantes + " minutos");

        scanner.close();
    }
}
