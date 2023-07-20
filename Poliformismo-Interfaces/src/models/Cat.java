package models;

import service.IAnimal;

public class Cat implements IAnimal {
    @Override
    public String makeSonic() {
        return "The cat make sonic";
    }
}
