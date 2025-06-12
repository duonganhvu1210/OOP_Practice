package org.example;

class Animal {
    void speak() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void speak() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    void speak() {
        System.out.println("Meow");
    }
}

class Cow extends Animal {
    void speak() {
        System.out.println("Moo");
    }
}

