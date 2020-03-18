package java8Study.streams;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {
 String name;
 String designation;
 Double salary;
 String city;
 
 Employee(String name,String designation,Double salary,String city){
	 this.name=name;
	 this.designation=designation;
	 this.salary=salary;
	 this.city=city;
 }
 
 public String toString() {
	 String s =String.format("(%s,%s,%.2f,%s)\n", name,designation,salary,city);
	 //return name+ "  " +designation+ " "+salary+ " "+ city;
	 return s;
 }
 
 


private static void populate(ArrayList<Employee> ar) {
	// TODO Auto-generated method stub
	Employee e = new Employee("Nidhi","Manager",250000d,"Gurgaon");
	 Employee e1= new Employee("Anjali","TL",250000d,"Gurgaon");
	 Employee e2= new Employee("Ayena","Developer",250000d,"Gurgaon");
	 Employee e3= new Employee("Meena","Senior dev",250000d,"Gurgaon");
	 Employee e4= new Employee("Priya","Director",250000d,"Gurgaon");
	 Employee e5= new Employee("Ayena","Ass Manager",250000d,"Gurgaon");
	 Employee e6= new Employee("Alisha","Associate",250000d,"Gurgaon");
	 Employee e7= new Employee("Sheetal","Manager",250000d,"Gurgaon");

	 ar.add(e);
	 ar.add(e1);
	 ar.add(e2);
	 ar.add(e3);
	 ar.add(e4);
	 ar.add(e5);
	 ar.add(e6);
	 ar.add(e7);
}

public static void display(Predicate<Employee> p,ArrayList<Employee> e) {
	for(Employee temp:e) {
		
		if(p.test(temp))
		{
			System.out.println(temp);
		}
	}
}

public static void main(String[] args) {
	ArrayList<Employee> ar = new ArrayList<Employee>();
	populate(ar);
	System.out.println(ar);
	
	Predicate<Employee> p1= emp->emp.designation.equals("Manager");
     display(p1,ar);
	
	
}
}
