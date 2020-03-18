package java8Study.streams;


interface interf123{
	public void m1();
}
public class LambdaExpressionVariableTest {
	
	int x =100;
	public void m2() {
		int y = 200;
	interf123 f =() ->{
		x=300;
		
		System.out.println(x);
		System.out.println(y);
	};
	f.m1();
	}
	
	public static void main(String[] args) {
		LambdaExpressionVariableTest test= new LambdaExpressionVariableTest();
		test.m2();
	}

}
