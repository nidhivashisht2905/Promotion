package java8Study.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionExampleFI {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
           al.add(20);	
           al.add(210);	
           al.add(30);	
           al.add(40);	
           al.add(60);
           
           Comparator<Integer> c = (a,b)-> {return (a>b?1:a<b?-1:0);};
           
             Collections.sort(al,c);
             System.out.println("List" + al);
        		   
        		   
        	
		
	}
}
