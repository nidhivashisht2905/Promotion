package java8Study.streams;

interface Multiply {
	public int multiply(int n );
}

//class MultiplyClass implements Multiply {
	//public void multiply() {
		//System.out.println("Multiplication Done");
	//}
	
//}


public class LambdaExpressionAndFI1 {
	
	public static void main(String[] args) {
		Multiply mc = n->{return n*n;};
		System.out.println(mc.multiply(10));
	}

}
