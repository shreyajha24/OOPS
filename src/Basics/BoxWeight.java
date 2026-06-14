package Basics;

public class BoxWeight extends Box{
    double weight;
    public BoxWeight(){
        this.weight = -1;
    }
    BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;
    }
    BoxWeight(double side,double weight){
        super(side);
        this.weight=weight;
    }
    public BoxWeight(double l,double h,double w,double weight){
        super(l,h,w);//calls the parent class constructor
        //used to initialize values present in parent class
        this.weight = weight;
        //what is accessed is based on the type of variable not on the type of variable.


    }
}
