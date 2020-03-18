package java8Study.streams;

import java.util.TreeMap;

public class TreeMapImplementation {

	public static void main(String[] args) {
		TreeMap<Integer,String> t = new TreeMap<Integer,String>();
		t.put(101, "Hunny");
		t.put(102, "Bunny");
		
		t.put(104, "Tunny");
		
		t.put(106, "Hunny");
		t.put(103, "Sunny");
		t.put(105, "Gunny");
		System.out.println(t);
	}
}
