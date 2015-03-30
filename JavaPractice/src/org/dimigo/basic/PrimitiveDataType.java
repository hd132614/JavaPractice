package org.dimigo.basic;

public class PrimitiveDataType {

    public static class Profile {
        public static String name = "아이유";
        /**
         * true     :   Male
         * false    :   Female
         */
        public static boolean sex = false;
        public static int age = 23;
        public static double length = 161.8;
        public static float weight = 44.3f;
        public static char blood = 'A';
    }

    public static void main(String[] asdf) {
        System.out.println("<< 아이유 프로필 >>");
        System.out.println("이름 : " + Profile.name);
        System.out.println((Profile.sex) ? ("성별 : 여자") : ("성별 : 남자"));
        System.out.println("나이 : " + String.valueOf(Profile.age) + "세");
        System.out.println("키 : " + String.valueOf(Profile.length) + "cm");
        System.out.println("몸무게 : " + String.valueOf(Profile.weight) + "kg");
        System.out.println("혈액형 : " + String.valueOf(Profile.blood) + "형");
    }
}
