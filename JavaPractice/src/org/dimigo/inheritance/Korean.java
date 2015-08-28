package org.dimigo.inheritance;

/**
 * Created by HIPERCUBE on 8/27/15.
 */
public class Korean implements Person{
    @Override
    public void sayHello() {
        System.out.println("안녕하세요~~");
    }

    @Override
    public void sayBye() {
        System.out.println("안녕히 가세요~~");
    }
}
