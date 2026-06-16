package Cloning;

public class Human implements Cloneable{
    int age;
    String name;
    public Human(int age,String name){
        this.age=age;
        this.name=name;
    }
    public Human(Human other){
        this.age=other.age;
        this.name=other.name;
    }
    /*@Override
    public Object clone() throws CloneNotSupportedException{
        //this is shallow copy
        return super.clone();

    }*/
    @Override
    public Object clone() throws CloneNotSupportedException {
        Human twin=(Human)super.clone();//this is actually shallow copy
        //deep copy-twin.arr=new int[twin.arr.length];
        //copy the current object in new array
        return twin;
    }
    //for primitives,it is copied as it is
    //for non-primitives it is pointing to same

    //deepcopy
    //for non primitives a new object is created
}
