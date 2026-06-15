package AbstractDemo;

public abstract class Parent {
    int age;
    public Parent(int age) {
        this.age=age;
    }//we cannot instantiate an abstract class directly
    //it can be instantiate by a derived type
    //we cannot create abstract constructors
    abstract void career(String name);
    abstract void partner(String name,int age);
    static void hello(){
        System.out.println("hello");
    }
    void normal(){
        System.out.println("normal");
    }
    //you cannot create objects of abstract class
    //cannot create object of abstract classes
    //cannot create abstract static methods
    //can create static methods in abstract classes
//abstract classes needs to be extended in order to be overriden

}
