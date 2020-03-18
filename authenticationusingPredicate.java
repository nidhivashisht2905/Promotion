package java8Study.streams;

import java.util.Scanner;
import java.util.function.Predicate;

public class authenticationusingPredicate {
	
	String  username;
	String password;
	authenticationusingPredicate(String username,String password){
		this.username=username;
		this.password=password;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter username");
		String enteredUsername=sc.next();
		System.out.println("Please enter username");
		String enteredPassword=sc.next();
		
		Predicate<authenticationusingPredicate> p = authObject-> authObject.username.equals("Nidhi")&& authObject.password.equals("Sharma");
		authenticationusingPredicate ap = new authenticationusingPredicate(enteredUsername,enteredPassword);

		
		
		
		
		if(p.test(ap)) {
			System.out.println("Hey There!");
		}
		else {
			System.out.println("Please login again");
		}
		
		
	}
}
