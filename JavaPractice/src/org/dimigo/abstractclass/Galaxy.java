package org.dimigo.abstractclass;

/**
 * Created by HIPERCUBE on 8/28/15.
 */
public class Galaxy extends SmartPhone {
    public Galaxy() {
        this("", "", 0);
    }

    public Galaxy(String model, String company, int price) {
        super(model, company, price);
    }

    @Override
    public void pay() {
        System.out.println("삼성페이로 결제합니다.");
    }

    public void useWirelessCharging() {
        System.out.println("무선충전 기능을 사용합니다.");
    }
}
