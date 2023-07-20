package models;

import implement.IAnimal;

public class Lion implements IAnimal {

    @Override
    public String sleeping() {
        return "The lion is eating";
    }

    @Override
    public String eating() {
        return "The lion is sleeping";
    }
}
