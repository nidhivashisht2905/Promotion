package java8Study.streams;

interface iterf{
	public void m1();
	
	
}

class Demo implements iterf{
	
	public void m1()
	{
		System.out.println("m1 implemetation using java 7");
	}
}
public class CallLambdaUsingFunctional {

	public static void main(String args[]) {
		iterf i = () -> System.out.println("m1 implementaion using java 8");
		i.m1();
		
		//iterf d = new Demo();
		//d.m1();
		
	}
}
