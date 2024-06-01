package java8;


interface Interf3{
	public int squareIt(int n);
}

class Demoo implements Interf3{
	
	public int squareIt(int n) {
		return n*n;
	}
}

public class B2 {
	
	public static void main(String[] args) {
		Demoo d = new Demoo();
		System.out.println("the square of 4 :" + d.squareIt(4));
	}

}
