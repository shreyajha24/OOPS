package Basics;

public class Main{
    public static void main(String[] args) {
        //Student s1 = new Student(343,"Shreya",12.5f);
        //s1.display();
        Box box=new Box(4.6,7.9,6.7);//compile-time polymorphism
        Box box1=new Box(box);
        //System.out.println(box.l+" "+box.h+" "+box.w);
        //BoxWeight box3=new BoxWeight();
        //System.out.println(box3.h+""+box3.weight);
       // Box box5=new BoxWeight(2,3,4,8);
       // System.out.println(box5.w);
        //BoxPrice box=new BoxPrice(5,8,200);
        //BoxPrice b = new BoxPrice();
        box1.greeting();
        //overriding depends on objects static doesn't hence static method cannot be overriden
        //you can inherit but cant override
        //static methods are not dependent on object of class
        //overloading and overriding doesn't apply to instance variable
        //Box box2=new BoxWeight();
        //box2.greeting();
    }
}
