package Basics;

public class Main{
    public static void main(String[] args) {
        //Student s1 = new Student(343,"Shreya",12.5f);
        //s1.display();
        //Box box=new Box(4.6,7.9,6.7);
        //Box box1=new Box(box);
        //System.out.println(box.l+" "+box.h+" "+box.w);
        BoxWeight box3=new BoxWeight();
        System.out.println(box3.h+""+box3.weight);
        Box box5=new BoxWeight(2,3,4,8);
        System.out.println(box5.w);
    }
}
