package org.dimigo.thread;

/**
 * Created by HIPERCUBE on 11/5/15.
 */
public class Runner extends Thread {
    private String name;

    public Runner() {

    }

    public Runner(String name) {
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
            if (distance == 0) {
                System.out.println(name + " 골인");
            }
        }
    }
}
