// Dada cualquier cadena "hoy es un día especial" 
// con cualquier longitud, se requiere encontrar el carácter con más ocurrencias
//  y el número de cálculos.

package Ejerciico_27;
 
import java.util.HashMap;
import java.util.Scanner;

public class Controller {

    public static String useScanner(){

        Scanner scannerText = new Scanner(System.in);
        System.out.print("Digite el texto: ");
        String text = scannerText.nextLine();

        return text;
    }

    public static char mostRepeatedCharacter(String text) {
        
        HashMap<Character, Integer> letterFrequency = new HashMap<>();
    
        // Calcular la frecuencia de cada letra
        for (char letter : text.toCharArray()) {
            if (letter != ' ') {
                letterFrequency.put(letter, letterFrequency.getOrDefault(letter, 0) + 1);
            }
        }
    
        // Encontrar el carácter más repetido
        char mostRepeatedChar = ' ';
        int maxFrequency = 0;
        for (char letter : letterFrequency.keySet()) {
            int frequency = letterFrequency.get(letter);
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mostRepeatedChar = letter;
            }
        }
    
        return mostRepeatedChar;
    }
}

