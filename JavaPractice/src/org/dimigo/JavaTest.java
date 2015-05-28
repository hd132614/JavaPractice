package org.dimigo;

/**
 * Created by HIPERCUBE on 15. 5. 4..
 */
public class JavaTest {


    public static void main(String[] args) {
        int[][] intArr1 = {
                {1, 2, 3, 4},
                {5, 6}
        };
        int[][] intArr2 = {
                new int[]{1, 2, 3, 4},
                new int[]{5, 6}
        };
        int[][] intArr3 = new int[][]{
                {1, 2, 3, 4},
                {5, 6}
        };
        int[][] intArr4 = {
                new int[]{1, 2, 3, 4},
                {5, 6}
        };
    }
}
