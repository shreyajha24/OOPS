package Basics;

public class Student {
    int rno;
    String name;
    float marks;
    Student(int rno, String name, float marks) {
        this.rno=rno;
        this.name=name;
        this.marks=marks;
    }
    void display(){
        System.out.println("Student "+rno+" "+name+" "+marks);
    }
}


