package java8Study.streams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CollectionArrayList {

	public static void main(String[] args) {
		Set<String> l = new HashSet<String>();
		l.add("Sunny");
		l.add("Bunny");
		l.add("Honey");
		l.add("Sunny");
		System.out.println(l);
	}
}
