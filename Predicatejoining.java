package java8Study.streams;

import java.util.function.Predicate;



public class Predicatejoining {
	
	public static void m2(Predicate<Integer>p,int[] x) {
		for(int x1 :x) {
			if(p.test(x1)) {
			System.out.println(x1);
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr= {2,4,56,78,78,95,56,34};
		Predicate<Integer> p1=x->x>10;
		Predicate<Integer> p2=x->x%2==0;
		System.out.println("Number greater than 10");
		m2(p1,arr);
		System.out.println("Even mumbers");
		m2(p2,arr);
		System.out.println("Odd mumbers");
		m2(p2.negate(),arr);
		System.out.println("numbers odd plus greater than 50");
		m2(p1.and(p2),arr);
	}
	

}
