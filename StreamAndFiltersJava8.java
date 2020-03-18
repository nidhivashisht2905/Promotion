package java8Study.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAndFiltersJava8 {
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(100);
		al.add(101);
		al.add(102);
		al.add(1004);
		al.add(10003);
		al.add(10005);
		al.stream().forEach(System.out::println);
		System.out.println("Print only even numbers");
		List<Integer> al2=al.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("Filtered List" + al2);
	}

}
