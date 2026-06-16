package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try{
            //divide(a,b);
            String name="Kunal";
            if(name.equals("Kunal")){
                throw new MyExceptions("name is Kunal");
            }
        }catch(MyExceptions e){
            System.out.println(e.getMessage());
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("this will always execute");
        }//there can be only one finally block
        //first put lower and more strict catch blocks because if you put Exception first lower ones like ArithmeticException will not execute
    }
    static int divide(int a,int b)throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("do not divide by zero");
        }
        return a/b;
    }
}
//throws used to declare exception
//throw is like a method
