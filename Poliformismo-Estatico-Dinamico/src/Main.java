import models.Animal;
import models.Dog;

public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Animal();
        Dog animal2 = new Dog();

        System.out.println("Estatico: " + animal1.makeStaticSound());
        System.out.println("Estatico: " + animal2.makeStaticSound());

        System.out.println("Dinamico: " + animal1.makeDynamicSound());
        System.out.println("Dinamico: " + animal2.makeDynamicSound());
    }
}