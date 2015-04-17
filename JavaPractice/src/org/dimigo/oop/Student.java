package org.dimigo.oop;

/**
 * Created by HIPERCUBE on 15. 4. 17..
 */
public class Student {

    public static final String str_title = "<< 학생 정보 출력 >>";
    public static final String str_studentNumber = "1. 학번 : ";
    public static final String str_name = "2. 이름 : ";
    public static final String str_name_none = "이름없음";
    public static final String str_address = "3. 주소 : ";
    public static final String str_address_none = "주소없음";
    public static final String str_phone = "4. 휴대폰번호 : ";
    public static final String str_phone_none = "휴대폰없음";

    public int gisu;
    public int grade;
    public int ban;
    public int number;
    public String name;
    public String address;
    public String phone;

    public Student(int gisu, int grade, int ban, int number, String name, String address, String phone) {
        this.gisu = gisu;
        this.grade = grade;
        this.ban = ban;
        this.number = number;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public Student(int gisu, int grade, int ban, int number, String name, String address) {
        this(gisu, grade, ban, number, name, address, null);
    }

    public Student(int gisu, int grade, int ban, int number, String name) {
        this(gisu, grade, ban, number, name, null);
    }

    public Student(int gisu, int grade, int ban, int number) {
        this(gisu, grade, ban, number, null);
    }

    public void printStudent() {
        System.out.println(str_title);
        System.out.println(str_studentNumber + gisu + grade + ban + String.format("%02d", number));
        System.out.println(str_name + (name == null ? str_name_none : name));
        System.out.println(str_address + (address == null ? str_address_none : address));
        System.out.println(str_phone + (phone == null ? str_phone_none : phone));
        System.out.println();
    }
}
