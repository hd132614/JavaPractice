package org.dimigo.basic;

/**
 * Created by HIPERCUBE on 15. 3. 20..
 */
public class Operator {
    public static void main(String[] args) {
        String start = "<< 도형 넓이 비교 >>";
        String Aname = "사다리꼴";
        String Bname = "평행사변형";
        String area = "넓이 :";

        String A = Aname + " " + area;
        String B = Bname + " " + area;

        float resultA = getA(9, 10, 5.8f);
        float resultB = getB(9, 5.4f);

        Boolean result = compare(resultA, resultB);

        System.out.println(start);
        System.out.println(A + String.format("%.1f", resultA));
        System.out.println(B + String.format("%.1f", resultB));
        if (result) {
            System.out.println(Aname + "이 " + Bname + " 보다 " + (resultA - resultB) + " 더 큽니다.");
        } else System.out.println(Bname + "이 " + Aname + " 보다 " + (resultB - resultA) + " 더 큽니다.");
    }

    public static float getA(float a, float b, float height) {
        return ((a + b) * height / 2);
    }

    public static float getB(float a, float height) {
        return (a * height);
    }

    public static boolean compare(float a, float b) {
        return a > b;
    }
}
