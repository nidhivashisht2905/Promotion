package java8Study.streams;

import java.util.function.Function;

public class FunctionExample {
	
	
	public static void main(String[] args) {
		Function<Integer,Integer> f=i->i*i;
		System.out.println("Square is " + f.apply(4));
	}

}
