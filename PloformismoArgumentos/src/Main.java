import models.Adder;

public class Main {
    public static void main(String[] args) {

        Adder operation = new Adder();

        System.out.println("Dos argumentos: " + operation.adding(1,2));
        System.out.println("Tres argumentos: " + operation.adding(1,2,3));
        System.out.println("Cuatro argumentos: " + operation.adding(1,2,3,4));
    }
}