package java8Study.streams;

import java.util.TreeSet;

public class TreeSetImplementation {

	public static void main(String[] args) {
		TreeSet<Integer> t1 = new TreeSet<Integer>((a,b)->(a>b)?-1:(a<b)?1:0);
		t1.add(10);	
		t1.add(101);
		t1.add(102);
		t1.add(102);
		t1.add(10);
		t1.add(103);
		System.out.println("treeset's natiral ordering" + t1);
	}
	
}
