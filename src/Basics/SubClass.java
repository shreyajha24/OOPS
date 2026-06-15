package Basics;
import Access.A;
public class SubClass extends A {
    public SubClass(int num,String name) {
        super(num,name);

    }

    public static void main(String[] args) {
        A obj=new SubClass(10,"kunal");
        //int n=obj.num;
        //only subclass can access protected class because parent classes do not have idea of child class but child class have the idea of parent class

    }

}
class SubSubClass extends SubClass {
    public SubSubClass(int num,String name) {
        super(num,name);
    }

    public static void main(String[] args) {
        SubSubClass obj=new SubSubClass(10,"kunal");
        //int n=obj.num;
    }
}
class SubClass2 extends A {
    public SubClass2(int num,String name) {
        super(num,name);

    }

    public static void main(String[] args) {
        A obj=new SubClass2(10,"kunal");
        //int n=obj.num;
        //only subclass can access protected class because parent classes do not have idea of child class but child class have the idea of parent class

    }

}
