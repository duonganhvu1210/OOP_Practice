package org.example;

//public class Teacher {
//    String name;
//    String subject;
//
//    public Teacher(String name, String subject) {
//        this.name = name;
//        this.subject = subject;
//    }
//
//    public void teach() {
//        System.out.println(name + " is teaching " + subject + ".");
//    }
//}

public class Teacher extends HomoSapiens implements iTeacher{

    @Override
    public void teach() {
        System.out.println("Teacher is teaching");
    }

    @Override
    public void teacher_study() {
        System.out.println("Teacher is studying");
    }


}

