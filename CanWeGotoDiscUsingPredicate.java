package java8Study.streams;

import java.util.function.Predicate;

public class CanWeGotoDiscUsingPredicate {
	
	String name;
	int age;
	boolean havingGirlfriend;
	
	CanWeGotoDiscUsingPredicate(String name, int age,boolean havingGirlfriend ){
		this.name=name;
		this.age=age;
		this.havingGirlfriend=havingGirlfriend;
	}
    
	public String toString() {
		return name;
	}
	
	public static void main(String[] args) {
		CanWeGotoDiscUsingPredicate[] list = {
				          new CanWeGotoDiscUsingPredicate("Nidhi",28,true),
				          new CanWeGotoDiscUsingPredicate("Monika",19,false),
				          new CanWeGotoDiscUsingPredicate("kareena",16,true),
				          new CanWeGotoDiscUsingPredicate("Katrina",32,true),
		};
		
		Predicate<CanWeGotoDiscUsingPredicate> p = test->test.age>20 && test.havingGirlfriend ==true;
		
		for(CanWeGotoDiscUsingPredicate cp:list) {
			if(p.test(cp)) {
				System.out.println("Members which are allowed ::: "+ cp);
			}
		}
		
		}
	}

