package com.company;

public class Ship extends Vehicle {
    private int passengers;
    private String port;
    Ship(){
        this.passengers = 150;
        this.port = "Odessa";
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
