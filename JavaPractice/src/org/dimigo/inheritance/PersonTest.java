package org.dimigo.inheritance;

/**
 * Created by HIPERCUBE on 8/27/15.
 */
public class PersonTest {
    private static void greeting(Person person) {
        person.sayHello();
        person.sayBye();
        System.out.println();
    }

    public static void main(String[] args) {
        Person personArray[] = new Person[3];
        personArray[0] = new Korean();
        personArray[1] = new Chinese();
        personArray[2] = new Japanese();

        for (Person p : personArray) greeting(p);
    }
}
