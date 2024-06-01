package java8;

// Check whether the given number is even or not using function 
import java.util.function.*;

class Example3{
     
      public static void main (String[]args){

        Predicate <Integer> p = i->i%2==0;
        System.out.println(p.test(4));
        System.out.println(p.test(5));
        
      }
}