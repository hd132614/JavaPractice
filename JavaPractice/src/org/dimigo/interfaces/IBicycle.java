package org.dimigo.interfaces;

/**
 * Created by HIPERCUBE on 9/7/15.
 */
public interface IBicycle {
    int MIN_GEAR = 1;
    int MIN_SPEED = 0;

    void changeGear(int gear);

    void speedUp(int speed);

    void speedDown(int speed);
}
