import models.Box;

public class Main {
    public static void main(String[] args) {

        Box<Integer> boxInteger = new Box<Integer>(10);
        Box<String> boxString = new Box<String>("Hello");

        System.out.println("Box integer: " + boxInteger.getContent());
        System.out.println("Box string: " + boxString.getContent());
    }
}