package org.dimigo.oop;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by HIPERCUBE on 5/14/15.
 */
public class Question {

    public static class QNA {
        public String question;
        public String answer;
        public String input;

        public QNA(String question, String answer) {
            this.question = question;
            this.answer = answer;
        }

        public boolean check() {
            if (answer.equals(input)) {
                System.out.println("정답\n");
                return true;
            } else {
                System.out.println("오답\n");
                return false;
            }
        }

        public void printQuestion() {
            System.out.println(question);
        }

        public void printAnswer() {
            System.out.println(answer);
        }
    }

    public static void main(String[] args) {
        ArrayList<QNA> questionList = new ArrayList<QNA>();
        questionList.add(new QNA("가장 좋아하는 가수는?", "없음"));
        questionList.add(new QNA("가장 좋아하는 배우는?", "없음"));
        questionList.add(new QNA("가장 좋아하는 과목은?", "Graphics, Android"));

        Scanner scanner = new Scanner(System.in);
        for (QNA aQNA : questionList) {
            aQNA.printQuestion();
            aQNA.input = scanner.nextLine();
            aQNA.check();
        }
        scanner.close();

        System.out.println("FINISHED");
    }
}
