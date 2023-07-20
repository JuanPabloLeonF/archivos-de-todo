import java.util.Scanner;

public class Ejercicio_8 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Ingrese el sueldo base del vendedor: ");
      double sueldoBase = scanner.nextDouble();
      System.out.print("Ingrese el valor de la primera venta: ");
      double venta1 = scanner.nextDouble();
      System.out.print("Ingrese el valor de la segunda venta: ");
      double venta2 = scanner.nextDouble();
      System.out.print("Ingrese el valor de la tercera venta: ");
      double venta3 = scanner.nextDouble();
      double comisionTotal = (venta1 + venta2 + venta3) * 0.1;
      double totalRecibido = sueldoBase + comisionTotal;
      System.out.println("El dinero a obtener por comisiones es: " + comisionTotal);
      System.out.println("El total que recibió en el mes es: " + totalRecibido);

      scanner.close();
   }
}
