package org.example;

public class Person {
    public Person() {
//        System.out.println("Ham tao mac dinh");
    }

    public Person(String name){
        this.name=name;
    }
    // Person variables definition
    public String name;
    public int age;
    public String address;

    public void walk(){
        System.out.printf("%s is walking%n", name);
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public void eat(){
        System.out.println("Eating");
    }

}
