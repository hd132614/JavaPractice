package org.dimigo.inheritance;

/**
 * Created by HIPERCUBE on 8/31/15.
 */
public class Tv {
    private String model;
    private String company;

    public Tv() {

    }

    public Tv(String model, String company) {
        this.model = model;
        this.company = company;
    }

    public void turnOn() {
        startService();
    }

    public void turnOff() {
        stopService();
    }

    protected void startService() {

    }

    protected void stopService() {

    }
}
