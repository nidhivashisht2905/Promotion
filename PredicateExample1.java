package java8Study.streams;

import java.util.function.Predicate;

public class PredicateExample1 {
	
	public static void main(String[] args) {
		Predicate<Integer> p=i->i%2==0;
		System.out.println("p is even" + p.test(4));
	}

}
