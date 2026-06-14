package Properties.Polymorphism;

public class Numbers {
    int sum(int a, int b) {
        return a + b;
    }
    int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Numbers n = new Numbers();
        n.sum(2,3);
        n.sum(2,3,4);
    }
}
