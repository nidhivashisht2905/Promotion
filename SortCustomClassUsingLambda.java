package java8Study.streams;

import java.util.ArrayList;
import java.util.Collections;

class Employee{
	int employeeId;
	String employeeName;
	
	Employee(int employeeId,String employeeName){
		this.employeeId=employeeId;
		this.employeeName=employeeName;
	}
	@Override
	public String toString() {
		return  employeeId +  employeeName;
	}
}
public class SortCustomClassUsingLambda {

	public static void main(String[] args) {
		ArrayList<Employee> a = new ArrayList<Employee>();
		a.add(new Employee(102,"Shargun"));
		a.add(new Employee(104,"Mehta"));
		a.add(new Employee(101,"Ammy"));
		a.add(new Employee(103,"Virk"));
		
		System.out.println("Before sorting");
		System.out.println(a);
		
		//Collections.sort(a,
				//(e1,e2)->(e1.employeeId>e2.employeeId)?1:(e1.employeeId<e2.employeeId)?-1:0);
				
				
		System.out.println("After sorting");
		System.out.println(a);
		
	}
	
	
}
