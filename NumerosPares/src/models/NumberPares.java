package models;

import java.util.List;

public class NumberPares {
    
    public static Double counterNumbersPares(List<Double> listNumbers){
        
        Double counter = 0d;
        Double number = 0d;
        for (Double listNumber : listNumbers) {
            
            number = listNumber;
            
            if(number % 2 == 0){
                counter++;
            }
        }
        
        return counter;
    }
    
    public static Double averageNumberPairs(List<Double> listNumbers, Double counterNumbers){
        
        Double average;
        Double sumTotal = 0d;
        for (Double number : listNumbers) { 
            
            if(number % 2 == 0){
                sumTotal += number;
            }
        }
        
        average = sumTotal / counterNumbers;
        return average;
    }
    
    public static Double sumTotalNumberPairs(List<Double> listNumbers){
        
        Double sumTotal = 0d;
        for (Double number : listNumbers) { 
            
            if(number % 2 == 0){
                sumTotal += number;
            }
        }
        
        return sumTotal;
    }
}
