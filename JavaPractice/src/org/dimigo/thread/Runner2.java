package org.dimigo.thread;

/**
 * Created by HIPERCUBE on 11/5/15.
 */
public class Runner2 implements Runnable {
    private String name;

    public Runner2() {

    }

    public Runner2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " 출발");

        for (int distance = 100; distance >= 0; distance -= 10) {
            System.out.println(name + " " + String.valueOf(distance) + " 미터");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(name + " 골인");
    }
}
