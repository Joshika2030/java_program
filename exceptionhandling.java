import java.util.*;

public class exceptionhandling{
    public static void main(String[] args) {
        int a =10;
        int b = 0;

        System.out.println("Start");

        try{
            System.out.println(a/b);
        }catch(ArithmeticException e){
            System.out.println("cannot divide by 0");
        }

        System.out.println("program completed");
    }
}
