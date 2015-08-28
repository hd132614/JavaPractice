package org.dimigo.inheritance;

/**
 * Created by HIPERCUBE on 8/27/15.
 */
public class Japanese implements Person{
    @Override
    public void sayHello() {
        System.out.println("오하요~~");
    }

    @Override
    public void sayBye() {
        System.out.println("사요나라~~");
    }
}
