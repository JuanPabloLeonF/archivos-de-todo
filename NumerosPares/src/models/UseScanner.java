package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UseScanner {
    
    public static List<Double> useScanner(){
        
        Scanner counterNumber = new Scanner(System.in);
        System.out.print("Digite la cantidad de numeros con los que desea trabajar: ");
        Integer counterNumbers = counterNumber.nextInt();
        
        Scanner scannerNumber = new Scanner(System.in);
        List<Double> listNumbers = new ArrayList<>();
        int counter = 0;
        
        while(counter < counterNumbers){
            
            counter++;
            System.out.print("Digite el numero " + counter + ": ");
            Double number =  scannerNumber.nextDouble();
            listNumbers.add(number);
        }
        
        return listNumbers;
    }
    
    public static Double counterTotalNumbers(List<Double> listNumbers){
        
        Double sumTotal = 0d;
        
        for (Double listNumber : listNumbers) {
            
            sumTotal += listNumber;
        }
        
        return sumTotal;
    }
    
    public static Double counterTotalNumbersEntered(List<Double> listNumbers){
        
        Double sumTotal = 0d;
        for (Double listNumber : listNumbers) {
            sumTotal ++;
        }
        
        return sumTotal;
    }
}
