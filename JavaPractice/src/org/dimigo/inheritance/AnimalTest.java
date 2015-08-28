package org.dimigo.inheritance;

/**
 * Created by HIPERCUBE on 8/17/15.
 */
public class AnimalTest {
    public static void main(String[] args){
        Animal[] animals = new Animal[5];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Tiger();


        Dog d = new Dog();
        d.bark();
    }
}
