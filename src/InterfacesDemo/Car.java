package InterfacesDemo;

public class Car implements Brake,Engine{
    @Override
    public void brake() {
        System.out.println("I brake like");
    }
    @Override
    public void start(){
        System.out.println("I start like");
    }
    @Override
    public void stop(){
        System.out.println("I stop like");
    }
    @Override
    public void accelerate(){
        System.out.println("I accelerate like");
    }
}
