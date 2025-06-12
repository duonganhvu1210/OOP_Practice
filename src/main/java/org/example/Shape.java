package org.example;

class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class CircleShape extends Shape {
    void draw() {
        System.out.println("Drawing circle");
    }
}

class SquareShape extends Shape {
    void draw() {
        System.out.println("Drawing square");
    }
}

class TriangleShape extends Shape {
    void draw() {
        System.out.println("Drawing triangle");
    }
}

