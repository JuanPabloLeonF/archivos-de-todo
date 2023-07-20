package models;

public class Dog extends Animal{

    public static String makeStaticSound(){
        return "The dog barks (static)";
    }
    @Override
    public String makeDynamicSound() {
        return "The dog barks (dynamic)";
    }
}
