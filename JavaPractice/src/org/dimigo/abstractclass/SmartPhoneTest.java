package org.dimigo.abstractclass;

import org.dimigo.inheritance.Galaxy;
import org.dimigo.inheritance.IPhone;

/**
 * Created by HIPERCUBE on 8/28/15.
 */
public class SmartPhoneTest {
    public static void main(String[] args) {
        SmartPhone[] phones = {
                new IPhone("IPhone 6", "애플", 700000),
                new Galaxy("갤럭시 S6", "삼성", 650000)
        };

        for (SmartPhone aPhone : phones) {
            System.out.println(aPhone);
            aPhone.turnOn();
            aPhone.pay();

            aPhone.useSpecialFunction();

            aPhone.turnOff();
            System.out.println();
        }
    }
}
