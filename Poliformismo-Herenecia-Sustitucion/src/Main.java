import model.Animal;
import model.Cat;
import model.Dog;

public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        System.out.println("Dog: " + animal1.makeSound());
        System.out.println("Cat: " + animal2.makeSound());
    }
}