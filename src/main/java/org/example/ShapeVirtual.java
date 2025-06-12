package org.example;

class ShapeVirtual {
    double calculateArea() {

    }
}

class RectangleVirtual extends ShapeVirtual {
    double length, width;
    RectangleVirtual(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }
}

class CircleVirtual extends ShapeVirtual {
    double radius;
    CircleVirtual(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

