package java8;

//wihout lambda expression

interface Interf
{
 public void add(int a , int b);
}

class Demo  implements Interf
{
  public void add(int a , int b)
  {
     System.out.println("the sum is : "+(a+b));
  }
}

class A
{
 public static void main (String[]args)
 {
     Interf i = new Demo();
      i.add(10,20);
 }
}