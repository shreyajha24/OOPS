package Comparing;

public class Student implements Comparable<Student>{
    int rno;
    float score;
    public Student(int rno, float score) {
        this.rno=rno;
        this.score=score;
    }
    @Override
    public int compareTo(Student o) {
        int diff=(int)(this.score-o.score);
        //if diff==0:means both are equal
        //if diff<1:means o is bigger else o is smaller
        return diff;
    }
}
