package org.dimigo.oop;

/**
 * Created by HIPERCUBE on 15. 4. 13..
 */
public class CarTest {

    /**
     * Final Strings
     */
    public static final String str_title = "<< 자동차 목록 >>";
    public static final String str_company = "제조사명 : ";
    public static final String str_model = "모델명 : ";
    public static final String str_color = "색상 : ";
    public static final String str_maxSpeed = "최대속도 : ";
    public static final String str_price = "가격 : ";

    public static void main(String[] args) {
        /**
         * set Cars
         */
        Car[] cars = {new Car(), new Car(), new Car()};
        cars[0].setCompany("현대자동차");
        cars[0].setModel("제네시스");
        cars[0].setColor("검정색");
        cars[0].setMaxSpeed(225);
        cars[0].setPrice(50000000);

        cars[1].setCompany("기아자동차");
        cars[1].setModel("K7");
        cars[1].setColor("흰색");
        cars[1].setMaxSpeed(246);
        cars[1].setPrice(40000000);

        cars[2].setCompany("삼성자동차");
        cars[2].setModel("SM7");
        cars[2].setColor("회색");
        cars[2].setMaxSpeed(200);
        cars[2].setPrice(38000000);


        /**
         * print Car info
         */
        System.out.println(str_title);
        for (Car aCar : cars) {
            System.out.println(str_company + aCar.getCompany());
            System.out.print(str_model + aCar.getModel());
            System.out.println(str_color + aCar.getColor());
            System.out.println(str_maxSpeed + aCar.getMaxSpeed());
            System.out.println(str_price + String.format("%,d", aCar.getPrice()) + "\n");
        }
    }
}
