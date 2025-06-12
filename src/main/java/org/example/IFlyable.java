package org.example;

interface IFlyable {
    void fly();
}

class Bird implements IFlyable {
    public void fly() {
        System.out.println("Bird is flying.");
    }
}

class Airplane implements IFlyable {
    public void fly() {
        System.out.println("Airplane is flying.");
    }
}

