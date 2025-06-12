package org.example;

interface IVehicle {
    void start();
    void accelerate();
    void brake();
}

class Car implements IVehicle {
    public void start() {
        System.out.println("Car started.");
    }
    public void accelerate() {
        System.out.println("Car accelerating.");
    }
    public void brake() {
        System.out.println("Car braking.");
    }
}

class Bike implements IVehicle {
    public void start() {
        System.out.println("Bike started.");
    }
    public void accelerate() {
        System.out.println("Bike accelerating.");
    }
    public void brake() {
        System.out.println("Bike braking.");
    }
}

class Truck implements IVehicle {
    public void start() {
        System.out.println("Truck started.");
    }
    public void accelerate() {
        System.out.println("Truck accelerating.");
    }
    public void brake() {
        System.out.println("Truck braking.");
    }
}

