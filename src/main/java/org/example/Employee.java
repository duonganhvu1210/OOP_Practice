package org.example;

abstract class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }
    abstract double calculateSalary();
}

class AdministrativeEmployee extends Employee {
    double baseSalary;
    AdministrativeEmployee(String name, double baseSalary) {
        super(name);
        this.baseSalary = baseSalary;
    }
    double calculateSalary() {
        return baseSalary;
    }
}

class ProductionEmployee extends Employee {
    int products;
    double rate;
    ProductionEmployee(String name, int products, double rate) {
        super(name);
        this.products = products;
        this.rate = rate;
    }
    double calculateSalary() {
        return products * rate;
    }
}

