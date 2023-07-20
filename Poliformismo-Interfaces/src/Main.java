import models.Cat;
import models.Dog;
import service.IAnimal;

public class Main {
    public static void main(String[] args) {

        IAnimal animal1 = new Dog();
        IAnimal animal2 = new Cat();

        System.out.println("Dog: " + animal1.makeSonic());
        System.out.println("Cat: " + animal2.makeSonic());
    }
}