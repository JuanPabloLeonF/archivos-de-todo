package models;

import service.IAnimal;

public class Dog implements IAnimal {
    @Override
    public String makeSonic() {
        return "The dog make sonic";
    }
}
