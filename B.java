package java8;

//with lambda expression

interface Interf2{
	public int squareIt(int n);
}

public class B {
	public static void main(String[] args) {
		
		Interf2 i = n->n*n;
		System.out.println(i.squareIt(4));
	    System.out.println(i.squareIt(5));
	}

}
