package com.company;

public class Plane extends Vehicle {
    private double height;
    private int passangers;

   Plane() {
       this.height = 2000;
       this.passangers = 300;

   }
       public double getHeight () {
           return height;
       }

       public void setHeight ( double height){
           this.height = height;
       }

       public int getPassangers () {
           return passangers;
       }

       public void setPassangers ( int passangers){
           this.passangers = passangers;
       }

}
