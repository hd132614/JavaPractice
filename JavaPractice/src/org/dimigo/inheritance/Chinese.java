package org.dimigo.inheritance;

/**
 * Created by HIPERCUBE on 8/27/15.
 */
public class Chinese implements Person{
    @Override
    public void sayHello() {
        System.out.println("니하오~~");
    }

    @Override
    public void sayBye() {
        System.out.println("짜이찌엔~~");
    }
}
