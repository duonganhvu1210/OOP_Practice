package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //set value
        Person p1 = new Person();
        p1.name= "Vu";
        p1.age = 25;
        p1.address= "Hanoi";

        //methods
        p1.walk();
        p1.sleep();
        p1.eat();


        Person p2 = new Person("Hung");
        p2.walk();
        p2.sleep();
        p2.eat();

//        //student class teacher testing
//        Student s1 = new Student("Nam", 16);
//        Student s2 = new Student("Linh", 17);
//        Student s3 = new Student("Hoa", 16);
//
//
        Teacher teacher = new Teacher();
        teacher.teach();
        teacher.name = "Cuong";
        teacher.age = 30;
        teacher.teacher_study();
//
//
//        Student[] studentList = {s1, s2, s3};
//        Classroom classroom = new Classroom(teacher, studentList);
//
//
//        classroom.startClass();

        HomoSapiens human= new HomoSapiens();
        human.name = "Homo";
        human.age= 19;
        human.walk();
        human.Run();

        Student student = new Student();
        student.name = "Hoc sinh";
        student.age =21;
        student.walk();
        student.Run();
        student.Study();
    }
}