import models.Calculator;

public class Main {
    public static void main(String[] args) {

        Calculator operation = new Calculator();

        System.out.println("Integer: " + operation.adding(3,6));
        System.out.println("Double: " + operation.adding(3.8,9.5));
    }
}