
import java.util.List;
import models.NumberImpares;
import models.UseScanner;
import models.NumberPares;

public class NumerosPares {

    public static void main(String[] args) {
        
        List listNumber =  UseScanner.useScanner();
        
        System.out.println("///////////////////////");
        System.out.println("Cantidad de numeros pares: " + NumberPares.counterNumbersPares(listNumber));
        Double counterPares = NumberPares.counterNumbersPares(listNumber);
        System.out.println("Promedio de numeros pares: " + NumberPares.averageNumberPairs(listNumber, counterPares));
        System.out.println("Suma total de numeros pares: " + NumberPares.sumTotalNumberPairs(listNumber));
        
        System.out.println("///////////////////////");
        System.out.println("Cantidad de numeros impares: " + NumberImpares.counterNumbersImpares(listNumber));
        Double counterImpares = NumberImpares.counterNumbersImpares(listNumber);
        System.out.println("Promedio de numeros impares: " + NumberImpares.averageNumberImpairs(listNumber, counterImpares));      
        System.out.println("Suma total de numeros impares: " + NumberImpares.sumTotalNumberImpairs(listNumber));
    
        System.out.println("///////////////////////");
        System.out.println("Suma total de numeros ingresados: " + UseScanner.counterTotalNumbers(listNumber));
        System.out.println("Cantidad total de numeros ingresados: " + UseScanner.counterTotalNumbersEntered(listNumber));
    } 
}