package java8Study.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<Integer>{
	
	public int compare(Integer a, Integer b) {
		return a>b?1:((a<b)?-1:0);

	}

	

	
}
public class CollectionsExample {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(15);
		l.add(5);
		l.add(25);
		l.add(25);
		l.add(30);
		l.add(35);
		l.add(45);
		System.out.println(l);
		Collections.sort(l,new MyComparator());
		System.out.println("New sorted list"+ l);
		
	}
}
