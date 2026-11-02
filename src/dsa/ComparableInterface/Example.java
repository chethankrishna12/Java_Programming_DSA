package dsa.ComparableInterface;


class Student implements Comparable<Student>{
	String name;
	int age;
	int marks;
	public Student(String name, int age, int marks) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	@Override
	public int compareTo(Student that) {
	
		return this.name.compareTo(that.name);
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}
	
}

public class Example {
	public static void main(String[] args) {
		
	}

}
