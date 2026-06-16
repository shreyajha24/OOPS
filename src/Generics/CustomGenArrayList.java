package Generics;
import java.util.ArrayList;
import java.util.Arrays;
public class CustomGenArrayList<T> {
    private Object[] data;//instance variable it will go out of scope when object is finished
    private static int DEFAULT_SIZE=10;
    private int size=0;//also working as index value
    public CustomGenArrayList(){
        this.data=new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if(this.isFull()){
            resize();
        }
        data[size++]=num;
    }
    private boolean isFull(){
        return size==data.length;
    }
    private void resize(){
        Object[] temp=new Object[data.length*2];
        //copy the current items int the new array
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }
    public T remove(){
        T removed=(T)(data[--size]);
        return removed;
    }
    public T get(int index){
        return (T)(data[index]);
    }
    public int size(){
        return size;
    }
    public void  set(int index,T value){
        data[index]=value;
    }
    @Override
    public String toString(){
        return "CustomArrayList{"+
                "data="+ Arrays.toString(data)+
                ",size="+size+
                '}';
    }
    public static void main(String[] args) {
        //ArrayList list = new ArrayList();
        //CustomGenArrayList list=new CustomGenArrayList();
        //list.add(1);
        //list.add(2);
        //list.add(3);
        //size is not the size of list it is the size of elements inserted
        //System.out.println(list);
        //cannot create static fields of type parameters
        //cannot use Casts or instanceof with parameterized types
        //cannot create arrays of parameterized types
        //cannot overload a method where the formal parameter types of each overload
        ArrayList<Integer> list1=new ArrayList<>();
        CustomGenArrayList<Integer> list3=new CustomGenArrayList<>();
        for(int i=0;i<5;i++){
            list3.add(2*i);
        }
        System.out.println(list3);
        //WildCard Example-ClassName<T extends Number>//can add question mark in place of T
        //Here T should be either Number or its subclasses

    }
}
