package models;

import implement.IAnimal;
import implement.ISpecialAnimal;

public class Hummingbird implements IAnimal, ISpecialAnimal {
    @Override
    public String sleeping() {
        return "The hummingbird is sleeping";
    }

    @Override
    public String eating() {
        return "The hummingbird is eating";
    }

    @Override
    public String flying() {
        return "The hummingbird is flying";
    }
}
