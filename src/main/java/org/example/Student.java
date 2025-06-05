package org.example;

//public class Student {
//    String name;
//    int age;
//
//    public Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public void study() {
//        System.out.println(name + " is studying.");
//    }
//}

public class Student extends HomoSapiens {
    public void Study() {
        System.out.println(super.name + " is studying");
    }
}

