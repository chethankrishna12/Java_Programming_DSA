package dsa.Comparator.sample1;

public class Student {
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
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}
}
