package java8Study.streams;

interface Interf {
	public void m1() ;
		
	
}


public class LambdaExpAndFI {

	public static void main(String[] args) {
		Interf f =  ()->System.out.println("Hello through Lambda expression");
		f.m1();	
	}
	
}
