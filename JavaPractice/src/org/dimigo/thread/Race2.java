package org.dimigo.thread;

/**
 * Created by HIPERCUBE on 11/5/15.
 */
public class Race2 {
    public static void main(String[] args) {
        System.out.println("main thread start");

        Thread t1 = new Thread(new Runner2("홍길동"));
        Thread t2 = new Thread(new Runner2("홍길순"));

        /**
         * setPriority
         */
//        t1.setPriority(Thread.MAX_PRIORITY);
//        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();

        System.out.println("main thread end");
    }
}
