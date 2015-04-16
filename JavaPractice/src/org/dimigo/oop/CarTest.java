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
        Car2[] cars = {new Car2("현대자동차", "제네시스", "검정색", 225, 50000000),
                new Car2("기아자동차", "K7", "흰색", 246, 40000000),
                new Car2("상성자동차", "SM7", "회색", 200, 38000000)};

        /**
         * print Car info
         */
        System.out.println(str_title);
        for (Car2 aCar : cars) {
            System.out.println(str_company + aCar.getCompany());
            System.out.print(str_model + aCar.getModel());
            System.out.println(str_color + aCar.getColor());
            System.out.println(str_maxSpeed + aCar.getMaxSpeed());
            System.out.println(str_price + String.format("%,d", aCar.getPrice()) + "\n");
        }
    }
}
