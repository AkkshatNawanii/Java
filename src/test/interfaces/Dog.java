package test.interfaces;

import test.interfaces.janwar.Animal;

public class Dog implements Animal {
    public int MAX_AGE = 7;
    @Override
    public void eat() {
        System.out.println("Nom Nom Nom");
    }

    @Override
    public void sleep() {
        System.out.println("zzzz");
    }
}
