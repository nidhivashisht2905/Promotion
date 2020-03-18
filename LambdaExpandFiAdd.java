package java8Study.streams;

interface Interfa{
	public void add(int a, int b );
}
public class LambdaExpandFiAdd {

	public static void main(String[] args) {
		Interfa i = (a,b)->System.out.println("sum is" + (a+b));
		i.add(4,5);
	}
	
}
