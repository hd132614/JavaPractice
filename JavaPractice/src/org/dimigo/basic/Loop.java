package org.dimigo.basic;

/**
 * Created by HIPERCUBE on 15. 3. 27..
 */
public class Loop {

    public static final int ARRANGE = 10;

    public static void main(String[] args) {
        for (int i = 0; i < ARRANGE; i++) {
            String result = "";
            for (int k = 0; k < ARRANGE; k++) {
                if (i == k) result += "*";
                else result += String.valueOf(k + 1);
            }
            System.out.println(result);
        }
    }
}
