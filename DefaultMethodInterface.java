package java8Study.streams;

interface Leftintr{
	default void m1() {
		System.out.println("Default Left method...");
	}
}

interface Rightintr{
	default void m1() {
		System.out.println("Default Right method...");
	}
}

public class DefaultMethodInterface implements Leftintr,Rightintr{
	public void m1() {
		System.out.println("My implementation");
		Leftintr.super.m1();
		
	}
	public static void main(String[] args) {
		DefaultMethodInterface ii = new DefaultMethodInterface();
		ii.m1();
	}
 
	
		 
	}
