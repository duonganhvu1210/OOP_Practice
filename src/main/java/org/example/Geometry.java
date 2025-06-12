package org.example;

abstract class  Geometry {
    abstract double area();
    abstract double perimeter();
}

class Square extends Geometry {
    double side;
    Square(double side) {
        this.side = side;
    }
    double area() {
        return side * side;
    }
    double perimeter() {
        return 4 * side;
    }
}

class Rectangle extends Geometry {
    double length, width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    double area() {
        return length * width;
    }
    double perimeter() {
        return 2 * (length + width);
    }
}

class Circle extends Geometry {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    double area() {
        return Math.PI * radius * radius;
    }
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}

