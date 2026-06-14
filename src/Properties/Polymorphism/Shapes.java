package Properties.Polymorphism;

public class Shapes {
    void area(){
        System.out.println("Area of Shapes");
    }
    //early binding-to prevent overriding and inheritance(final keyword)
    //final void area(){
      //  System.out.println("Area of Shapes");
   // }
    //whenever a class is declared implicitly it's methods are considered final too
}
