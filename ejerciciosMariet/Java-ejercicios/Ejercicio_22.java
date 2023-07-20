import java.util.Scanner;

public class Ejercicio_22 {
    public static void main(String[] args) {
        int num;
        int num2;
        int num3;
        int num4;
       
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite el primer número entero: ");
        num = scanner.nextInt();
        System.out.print("Digite el segundo número entero: ");
        num2 = scanner.nextInt();
        System.out.print("Digite el tercero número entero: ");
        num3 = scanner.nextInt();
        System.out.print("Digite el cuarto número entero: ");
        num4 = scanner.nextInt();
        
        if(num > num2 && num2 > num3 && num3 > num4) {
    
            
            System.out.println("El numero mayor es: " + num);

        } else if(num < num2 && num2 > num3 && num3 > num4) {
            
            
            System.out.println("El numero mayor es: " + num2);

        } else if(num < num2 && num2 < num3 && num3 > num4) {
            
            
            System.out.println("El numero mayor es: " + num3);                     
        } else if(num2 > num && num > num3 && num3 < num4) {
           
            System.out.println("El numero mayor es: " + num4);  
}

        
        
        
        
        
        scanner.close();
    }
}
