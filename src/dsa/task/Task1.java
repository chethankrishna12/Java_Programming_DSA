package dsa.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Employee {
	String name;
	int empID;
	double salaray;
	String dep_name;

	public Employee(String name, int empID, double salaray, String dep_name) {
		this.name = name;
		this.empID = empID;
		this.salaray = salaray;
		this.dep_name = dep_name; 
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empID=" + empID + ", salaray=" + salaray + ", dep_name=" + dep_name + "]";
	}

}

public class Task1 {
	public static void main(String[] args) {

		List<Employee> l = new ArrayList<>();
		l.add(new Employee("Sunil", 1002, 50000, "HR"));
		l.add(new Employee("Rahul", 1005, 65000, "IT"));
		l.add(new Employee("Priya", 1001, 55000, "Finance"));
		l.add(new Employee("Anjali", 1008, 72000, "IT"));
		l.add(new Employee("Kiran", 1004, 48000, "Sales"));
		l.add(new Employee("Meena", 1007, 60000, "HR"));
		l.add(new Employee("Arjun", 1003, 75000, "Finance"));
		l.add(new Employee("Divya", 1010, 52000, "Sales"));
		l.add(new Employee("Vijay", 1006, 68000, "IT"));
		l.add(new Employee("Sneha", 1009, 45000, "HR"));
		System.out.println("1.Data of Employees :");
		for (Employee e : l) {
			System.out.println(e);
		}

		System.out.println();
		System.out.println("2. Department Names :");
//		for (Employee e : l) {
//			System.out.println(e.dep_name);
//		}
		
		Set<String> set=new HashSet<String>();
		for (Employee e : l) {
			set.add(e.dep_name);
		}
		for (String e : set) {
			System.out.println(e);
		}
		
		
		

		Comparator<Employee> com = (i, j) -> i.salaray > j.salaray ? 1 : -1;
		System.out.println();
		System.out.println("3. Salaray in ascending order :");
		Collections.sort(l, com);
		for (Employee e : l) {
			System.out.println(e.salaray);
		}
		
		
		System.out.println();
		System.out.println("4. Details of Employees with salaray 60k above :");
		for (Employee e : l) {
			if(e.salaray>60000) {
				System.out.println(e);
			}
			
		}
	}

}
