package Cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human kunal=new Human(34,"kunal");
        //Human twin=new Human(kunal);//making copy of kunal
        //Cloning is a type of method in the object class
        Human twin=(Human)kunal.clone();
        System.out.println(twin.name+" "+twin.age);
    }
}
