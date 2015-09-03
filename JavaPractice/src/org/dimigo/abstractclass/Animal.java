package org.dimigo.abstractclass;

/**
 * Created by HIPERCUBE on 8/17/15.
 */
public abstract class Animal {

    private String name;

    public Animal() {

    }

    public static void eat() {
        System.out.println("EAT");
    }

    public void sleep() {
        System.out.println("SLEEP");
    }

    public void bark() {
        System.out.println("BARK");
    }
}
