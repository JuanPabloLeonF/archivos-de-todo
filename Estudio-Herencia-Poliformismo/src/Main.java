import models.Hummingbird;
import models.Lion;
import models.WhiteShark;

public class Main {
    public static void main(String[] args) {

        Lion lion = new Lion();
        System.out.println("Lion: " + lion.eating());
        System.out.println("Lion: " + lion.sleeping());

        Hummingbird hummingbird = new Hummingbird();
        System.out.println("Hummingbird: " + hummingbird.eating());
        System.out.println("Hummingbird: " + hummingbird.sleeping());
        System.out.println("Hummingbird: " + hummingbird.flying());

        WhiteShark whiteShark = new WhiteShark();
        System.out.println("whiteShark: " + whiteShark.eating());
        System.out.println("whiteShark: " + whiteShark.sleeping());
        System.out.println("whiteShark: " + whiteShark.swimming());
    }
}