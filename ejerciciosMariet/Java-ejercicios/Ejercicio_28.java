import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.*;

public class Ejercicio_28 {

    public static void main(String[] args) {

        boolean iteratorMain = true;
        int attemptCounter = 0;
        Scanner scannerName = new Scanner(in);
        Scanner scannerElectionPlay = new Scanner(in);
        boolean iterator = true;
        int lengthMaximum = 30;
        String name = null;
        Integer numberRandom = null;
        Scanner scannerNumber = null;
        int numberSelected;

        HashMap<String, Integer> Participants = new HashMap();
        while(iteratorMain) {

            out.print("Digite (si), si deseas jugar o (no) para salir de la aplicacion: ");
            String electionPlay = scannerElectionPlay.nextLine();

            if(electionPlay.equalsIgnoreCase("si")) {
                out.print("Digite tu nombre por favor: ");
                name = scannerName.nextLine();
                Random random = new Random();
                numberRandom = random.nextInt(lengthMaximum + 1);
                scannerNumber = new Scanner(in);
                iterator = true;
            }else if(electionPlay.equalsIgnoreCase("no")) {
                iterator = false;
                iteratorMain = false;
                scannerName.close();
                scannerElectionPlay.close();
                break;
            }else {
                out.println("No digiste una opcion correcta entre (SI) y (NO)");
            }

            while(iterator) {

                out.print("Digite un numero: ");
                numberSelected = scannerNumber.nextInt();

                if (numberSelected > numberRandom) {
                    out.println("¡UP te pasastes!");
                }

                if (numberSelected < 0) {
                    out.println("Mejor intentalo con numeros mayores a 0");
                }

                if (numberSelected != numberRandom) {
                    attemptCounter += 1;
                }

                if (numberSelected == numberRandom) {
                    Participants.put(name,attemptCounter );
                    out.println("¡GENIAL LO LOGRASTE!");
                    iterator = false;
                    attemptCounter = 0;
                }

                out.println("Tienes que buscar: " + numberRandom);
            }
        }

        out.println(Participants);
    }
}
