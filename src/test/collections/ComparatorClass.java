package test.collections;

import java.util.*;

class Student {
	String name;
	double gpa;

	Student(String name, double gpa){
		this.name = name;
		this.gpa = gpa;

	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return 	"Name='" + name + '\'' +
				", GPA=" + gpa
				;
	}
}

class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2){
		return -o1.compareTo(o2);
	}
}
public class ComparatorClass {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(1);
		list.add(3);

		List<String> words = Arrays.asList("banana", "apple","date");

		words.sort(new StringLengthComparator());
		System.out.println(words);
		words.sort((a,b) ->  b.length()- a.length() );
		System.out.println(words);


		List<Student> students = new ArrayList<>();
		students.add(new Student("Alex", 3.7));
		students.add(new Student("Shobit", 3.3));
		students.add(new Student("WompWomper", 2.9));
		students.add(new Student("Mahila", 3.9));
		students.add(new Student("Chomdu", 3.3));


		students.sort(Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName) );
		System.out.println(students.toString());
		Collections.sort(students, Comparator.comparing(Student::getGpa).thenComparing(Student::getName));
		System.out.println(students.toString());
	}
}
