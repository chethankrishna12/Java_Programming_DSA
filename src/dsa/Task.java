package dsa;



import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class Task {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student("Alice", 85));
        list.add(new Student("Bob", 92));
        list.add(new Student("Charlie", 85));
        list.add(new Student("David", 95));
        list.add(new Student("Eve", 92));

        Comparator<Student> com = (i, j) ->
            i.marks != j.marks
                ? Integer.compare(j.marks, i.marks)
                : i.name.compareTo(j.name);

        list.sort(com);

        for (Student s : list) {
            System.out.println(s.name + " = " + s.marks);
        }
    }
}

