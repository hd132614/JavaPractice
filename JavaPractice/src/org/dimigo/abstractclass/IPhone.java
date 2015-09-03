package org.dimigo.abstractclass;

import org.dimigo.inheritance.SmartPhone;

/**
 * Created by HIPERCUBE on 8/28/15.
 */
public class IPhone extends SmartPhone {
    public IPhone() {
        this("", "", 0);
    }

    public IPhone(String model, String company, int price) {
        super(model, company, price);
    }

    @Override
    public void pay() {
        System.out.println("애플페이로 결제합니다.");
    }

    public void useAirDrop() {
        System.out.println("AirDrop 기능을 사용합니다.");
    }
}
