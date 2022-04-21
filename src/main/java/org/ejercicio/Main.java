package org.ejercicio;

public class Main {
    public static void main(String[] args) {

    SmartPhone smartPhone = new SmartPhone(100, "Android 10", "Negro", 7, true, true, true, true);
    SmartWatch smartWatch = new SmartWatch(100, "Android 6.1", "Negro", 3, 22, true, 100, 80, 25);

    System.out.println(smartPhone.toString());
    System.out.println(smartWatch.toString());

    }
}