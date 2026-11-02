package dsa.Comparator.sample1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Mianclass {
	public static void main(String[] args) {
		Comparator<Student> com=(i,j)->i.marks>j.marks?1:-1;
		List<Student> l1=new ArrayList<Student>();
		l1.add(new Student("bheesma",23,25));
		l1.add(new Student("arjun",27,88));
		l1.add(new Student("raadhe",22,97));
		l1.add(new Student("krishna",24,98));
		l1.add(new Student("doryodhana",27,54));
		
		Collections.sort(l1,com);
		for(Student res:l1) {
			System.out.println(res);
		}
	}
}
