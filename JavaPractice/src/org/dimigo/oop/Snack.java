package org.dimigo.oop;

/**
 * Created by HIPERCUBE on 5/18/15.
 */
public class Snack {

    private String name;
    private String company;
    private int price;
    private int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Snack(String name, String company, int price, int number) {
        this.name = name;
        this.company = company;
        this.price = price;
        this.number = number;
    }

    public Snack() {
        this(null, null, 0, 0);
    }

    public void printSnack() {
        System.out.println("이름 : " + this.name);
        System.out.println("제조사 : " + this.company);
        System.out.println("가격 : " + this.price);
        System.out.println("개수 : " + this.number + "\n");
    }

    public int calcPrice() {
        return price * number;
    }
}
