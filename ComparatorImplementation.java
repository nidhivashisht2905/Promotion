package java8Study.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//class MyComparator1 implements Comparator<Integer>{
	
	//public int compare(Integer i,Integer j) {
	//	if(i>j) {
		//	return -1;
		//}
		//else if(i<j) {
			//return 1;
		//}
		
		//	return 0;
		
	//}
//}


public class ComparatorImplementation {
public static void main(String[] args) {
	
	ArrayList<Integer> l1 = new ArrayList<Integer>();
	l1.add(10);
	l1.add(5);
	l1.add(100);
	l1.add(560);
	l1.add(6678);
	//Collections.sort(l1, new MyComparator1());
	//System.out.println("List after sorting :::"+ l1);
	
	
	//java8
	
	Collections.sort(l1, (a,b)->(a>b)?1:(a<b)?-1:0);
	
	System.out.println("List after sorting with java8:::"+ l1);
	
}

}
