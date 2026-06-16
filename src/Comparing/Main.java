package Comparing;

public class Main {
    public static void main(String[] args) {
        Student kunal=new Student(12,89.76f);
        Student rahul=new Student(5,99.52f);
        if(kunal.compareTo(rahul)<0){
            System.out.println(kunal.compareTo(rahul));
            System.out.println("Rahul has more marks");
        }
        //Arrays.sort(list,(o1,o2)->-(int)(o1.score-o2.score));--lambda functions
    }
}
