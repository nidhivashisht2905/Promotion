package java8Study.streams;

import java.util.HashMap;
import java.util.Map;

public class MapImplementation {

	public static void main(String[] args) {
		Map<String,String> m =new HashMap<String,String>();
		m.put("A","Apple");
		m.put("Z","Zebra");
		m.put("H","Horse");
		m.put("A","Apple");
		
		System.out.println(m);
	}
}
