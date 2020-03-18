package java8Study.streams;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PrintnamesUsingPredicate {
	
	public static void m1(Predicate<String> p,String[] s) {
		
		for(String s1 :s) {
			if(p.test(s1)) {
				System.out.println(s1);
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		String[] arr= {"sneha","Nidhi","","Manisha","Sonali","","Sonia"};
		Predicate<String> p1=x->x.startsWith("S");
	    //m1(p1,arr);
		
	    System.out.println("Check empty string and null value, remove empty string");
	    Predicate<String> p2=x->x.length()!=0 && x!=null;
	    ArrayList<String> al = new ArrayList<String>();
	    for(String s1 :arr) {
			if(p2.test(s1)) {
				al.add(s1);
			}
		}
	    System.out.println("Valid strings ::" +  al);
	    
	}

}
