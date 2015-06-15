package org.dimigo.oop;

/**
 * Created by HIPERCUBE on 6/15/15.
 */
public class PiggyBankTest {

    public static void main(String[] args) {
        PiggyBank bank = new PiggyBank();

        FamilyMember father = new FamilyMember("아빠");
        FamilyMember mother = new FamilyMember("엄마");
        FamilyMember me = new FamilyMember("냐");
        FamilyMember brother = new FamilyMember("남동생");

        bank.putMoney(father, 10000);
        bank.putMoney(mother, 5000);
        bank.putMoney(me, 2000);
        bank.putMoney(brother, 1000);
        bank.printBalance();
        bank.putMoney(me, 1000);
        bank.printBalance();
    }
}
