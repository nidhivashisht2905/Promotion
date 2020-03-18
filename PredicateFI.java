package java8Study.streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateFI {
	
	public static void main(String[] args) {
		
		System.out.println("Integer Predicate ::::::::::");
		Predicate<Integer> p=I->I>10; 
		System.out.println("lets see if 100 is greater than 10 :: "+ p.test(100));
		
		
		System.out.println("String Predicate ::::::::::");
		Predicate <String> p1 = s->s.length()>5;
		System.out.println("If length of abcdef is greater than 5 :::"+p1.test("abcdef"));
		
		System.out.println("COllection Predicate ::::::::::");
		Predicate<Collection> p3 =c->c.isEmpty();
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(100);
		System.out.println("Check if Colection is blank :: "+ p3.test(ar));
	}

}
