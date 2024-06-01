package java8;


//write  a method which can take one int value as an argument and returns square value of that number
	// using functions from funtion package 

	import java.util.function.*;


public  class Example2 {

	
	     public static void main (String[]args)
	    {
	        Function<Integer , Integer> f=i->i*i;
	         System.out.println("the square of 40 :" + f.apply(40));
	    }
	}
