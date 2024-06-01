package java8;

//by using lambda interface

//interface Interf
//{
// public void add(int a , int b);
//}


class A2
{
 public static void main (String[]args)
 {
     Interf i =(a,b)->System.out.println("the sum is : "+(a+b));
      i.add(20,20);
 }
}