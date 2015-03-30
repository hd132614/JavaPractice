package org.dimigo.basic;

import java.util.Scanner;

/**
 * Created by HIPERCUBE on 15. 3. 27..
 */
public class WhatNumber {

    public static int count = 0;
    public static int solution;
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //랜덤 숫자 적용
        solution = randomInt();

        while (true) {
            int input;
            System.out.println("값을 입력하세요 =>");
            input = scan.nextInt();
            if (check(solution, input)) {
                scan.close();
                break;
            } else if (count == 3) {//횟수 초과
                scan.close();
                System.out.println("3회 틀렸습니다. 다음 기회에!!");
                break;
            }
        }
        System.exit(0);
    }

    /**
     * 입력값 검사해주는 함수
     */
    public static boolean check(int sol, int input) {
        if (sol == input) {//정답일때
            System.out.println("숫자를 맞추셨습니다!! 정답 : " + input);
            return true;
        } else if (sol < input) {//작게 입력
            count++;
            System.out.println(input + " 보다 작습니다.");
            System.out.println("틀린 횟수 : " + count);
            return false;
        } else {//크게 입력
            count++;
            System.out.println(input + " 보다 큽니다.");
            System.out.println("틀린 횟수 : " + count);
            return false;
        }
    }

    /**
     * 1~10 사이의 랜던 숫자 생성
     */
    public static int randomInt() {
        return (int) (Math.random() * 10) + 1;
    }
}
