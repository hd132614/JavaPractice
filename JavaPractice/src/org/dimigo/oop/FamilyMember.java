package org.dimigo.oop;

/**
 * Created by HIPERCUBE on 6/15/15.
 */
public class FamilyMember {
    private int memberCnt = 0;
    private String memberName;

    public FamilyMember(String memberName) {
        this.memberName = memberName;
        ++memberCnt;
    }

    public String getMemberName() {
        return memberName;
    }

    public void printMemberCnt() {
        System.out.println("가족 총 인원 수 : " + memberCnt + "명");
    }
}
