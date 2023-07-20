import java.util.Scanner;

public class Ejercicio_9 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Ingrese el total de la compra: ");
      double totalCompra = scanner.nextDouble();
      double descuento = totalCompra * 0.15;
      double totalAPagar = totalCompra - descuento;
      System.out.println("El descuento aplicado es de: " + descuento);
      System.out.println("El total a pagar es de: " + totalAPagar);

      scanner.close();
   }
}
