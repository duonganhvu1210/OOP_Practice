package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Geometry g = new Circle(5);
        System.out.println("Circle area: " + g.area());

        BankAccount acc = new BankAccount("123", 1000);
        acc.deposit(500);
        System.out.println("Balance: " + acc.getBalance());

        GeometryManager.printArea(new Rectangle(5, 4));

        Employee emp = new ProductionEmployee("John", 100, 10);
        System.out.println("Salary: " + emp.calculateSalary());

        IFlyable flyObj = new Airplane();
        flyObj.fly();

        Shape s = new TriangleShape();
        s.draw();

        Animal a = new Dog();
        a.speak();

        Animal b = new Cat();
        b.speak();

        IVehicle v = new Bike();
        v.start();

        Manager m = new Manager();
        m.name = "Alice";
        m.age = 40;
        m.department = "HR";
        m.teamSize = 5;

        ShapeVirtual sv = new RectangleVirtual(3, 4);
        System.out.println("Virtual area: " + sv.calculateArea());
    }
}
