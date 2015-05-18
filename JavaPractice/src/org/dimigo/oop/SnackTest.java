package org.dimigo.oop;

import java.util.ArrayList;

/**
 * Created by HIPERCUBE on 5/18/15.
 */
public class SnackTest {

    public static void main(String[] args) {
        ArrayList<Snack> snackList = new ArrayList<Snack>();
        snackList.add(new Snack("새우깡", "농심", 1100, 2));
        snackList.add(new Snack("콘칩", "크라운", 1200, 1));
        snackList.add(new Snack("허니버터칩", "해태", 1500, 4));

        int result = 0;
        for (Snack aSnack : snackList) {
            aSnack.printSnack();
            result += aSnack.calcPrice();
        }
        System.out.println("총 구매 금액 : " + String.format("%,d", result) + "원");
    }
}
