package org.dimigo.basic;

/**
 * Created by HIPERCUBE on 15. 3. 23..
 */
public class Condition {

    public static class DefaultCharge {
        public static final int bus = 850;
        public static final int car = 300;
        public static final int etc = 600;
    }

    public static class PlusCharge {
        public static final int bus = 300;
        public static final int car = 200;
        public static final int etc = 200;
    }

    public static class Holder {
        public int distance;
        public String car;

        public Holder(int distance, String car) {
            this.distance = distance;
            this.car = car;
        }
    }

    public static void calculate(Holder object) {
        System.out.println("<< 고속도로 통행료 계산 >>");
        System.out.println("거리 : " + object.distance + "km");
        System.out.println("차종 : " + object.car);
        int charge = 0;
        if (object.car.equals("고속버스")) {
            charge += DefaultCharge.bus;
            if (object.distance - 10 > 0) {
                charge += ((object.distance) / 10) * PlusCharge.bus;
            }
        } else if (object.car.equals("경차")) {
            charge += DefaultCharge.car;
            if (object.distance - 10 > 0) {
                charge += ((object.distance) / 10) * PlusCharge.car;
            }
        } else if (object.car.equals("그 외")) {
            charge += DefaultCharge.etc;
            if (object.distance - 10 > 0) {
                charge += ((object.distance) / 10) * PlusCharge.etc;
            }
        }
        System.out.println("통행료 : " + charge + "원");
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Holder[] holder = {new Holder(10, "고속버스"), new Holder(10, "경차"), new Holder(10, "그 외"), new Holder(25, "고속버스"), new Holder(25, "경차"), new Holder(25, "그 외")};
        for (Holder aHolder : holder) {
            calculate(aHolder);
        }
    }
}
