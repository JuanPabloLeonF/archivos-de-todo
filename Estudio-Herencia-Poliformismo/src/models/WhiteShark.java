package models;

import implement.IAnimal;
import implement.ISpecialAnimalS;

public class WhiteShark implements IAnimal, ISpecialAnimalS {
    @Override
    public String sleeping() {
        return "The white shark is sleeping";
    }

    @Override
    public String eating() {
        return "The white shark is eating";
    }

    @Override
    public String swimming() {
        return "The white shark is swimming";
    }
}
