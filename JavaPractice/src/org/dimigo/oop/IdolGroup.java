package org.dimigo.oop;

/**
 * Created by HIPERCUBE on 5/28/15.
 */
public class IdolGroup {
    public static String bigbangName = "<< 백뱅 멤버 >>";
    public static String[] bigbang = {"GD", "태양", "대성", "탑", "승리"};
    public static String twone1Name = "<< 2NE1 멤버 >>";
    public static String[] twone1 = {"CL", "산다라박", "박봄", "민지"};
    public static String girlsdayName = "<< 걸스데이 멤버 >>";
    public static String[] girsday = {"유라", "헤리", "소진", "민아"};
    public static String[][] idolGroup = {bigbang, twone1, girsday};

    public static void main(String[] args) {
        for (String[] array : idolGroup) {
            if (array == bigbang) System.out.println(bigbangName);
            else if (array == twone1) System.out.println(twone1Name);
            else if (array == girsday) System.out.println(girlsdayName);
            for (String a : array) {
                System.out.println(a);
            }
            System.out.println();
        }
    }
}
