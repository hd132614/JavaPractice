package org.dimigo.oop;


import java.util.Scanner;

/**
 * Created by HIPERCUBE on 5/14/15.
 */
public class Score {
    public int kor;
    public int math;
    public int english;

    public int getTotal() {
        return kor + math + english;
    }

    public String getAverage() {
        return String.format("%.1f", (float) getTotal() / 3);
    }

    public static void main(String[] args) {
        Score score = new Score();

        Scanner scanner = new Scanner(System.in);
        System.out.print("국어 점수 입력 => ");
        score.kor = scanner.nextInt();
        System.out.print("수학 점수 입력 => ");
        score.math = scanner.nextInt();
        System.out.print("영어 점수 입력 => ");
        score.english = scanner.nextInt();
        scanner.close();

        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append("<< 점수출력 >>\n")
                .append("국어점수 : ").append(score.kor).append("\n")
                .append("수학 점수 : ").append(score.math).append("\n")
                .append("영어 점수 : ").append(score.english).append("\n")
                .append("총점 : ").append(score.getTotal()).append(" 점").append("\n")
                .append("평균 : ").append(score.getAverage()).append(" 점").append("\n"));

    }
}
