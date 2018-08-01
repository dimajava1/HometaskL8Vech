package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Plane Boing = new Plane();
        System.out.println("Введите цену, скорость и год выпуска самолёта: ");
        Boing.setPrice(in.nextInt());
        Boing.setSpeed(in.nextInt());
        Boing.setYear(in.nextInt());
        Car Honda = new Car();
        System.out.println("Введите цену, скорость и год выпуска автомобиля: ");
        Honda.setPrice(in.nextInt());
        Honda.setSpeed(in.nextInt());
        Honda.setYear(in.nextInt());
        Ship Titanik = new Ship();
        System.out.println("Введите цену, скорость и год выпуска судна: ");
        Titanik.setPrice(in.nextInt());
        Titanik.setSpeed(in.nextInt());
        Titanik.setYear(in.nextInt());
        System.out.println("Самолёт Boing 666: " + Boing.getHeight()+ " - высота полета, " + Boing.getPassangers() +" - количество пассажиров,  "
                + Boing.getPrice() +" - цена,  " +Boing.getSpeed() +"  -скорость,  " + Boing.getYear() + "  - год выпуска.");
        System.out.println(" ");
        System.out.println("Машина Honda Civic: " + Honda.getPrice() +" - цена, " + Honda.getSpeed() + " - скорость, " + Honda.getYear() + " - год выпуска.");
        System.out.println(" ");
        System.out.println("Судно Титаник: " + Titanik.getPort() + " - порт приписки, " + Titanik.getPassengers() + " - пассажиры, " + Titanik.getPrice() + " - цена, "
                + Titanik.getSpeed() + " - скорость, " + Titanik.getYear() + " - год выпуска.");
        }
    }


