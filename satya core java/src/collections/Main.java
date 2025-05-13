package collections;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> al = new ArrayList<Employee>();

//		Employee e1 = new Employee(101, "sachin", "anaylyast", 55000.0f);
//		Employee e2 = new Employee(102, "rahul", "architect", 65000.0f);
//		Employee e3 = new Employee(103, "ramesh", "programmer", 85000.0f);
//		Employee e4 = new Employee(104, "ram", "managerr", 55000.0f);
//		Employee e5 = new Employee(105, "msd", "tester", 55000.0f);

		al.add(new Employee(101, "sachin", "anaylyast", 55000.0f));
		al.add(new Employee(102, "rahul", "architect", 65000.0f));
		al.add(new Employee(104, "ram", "managerr", 55000.0f));
		al.add(new Employee(105, "msd", "tester", 55000.0f));
		al.add(new Employee(103, "ramesh", "programmer", 85000.0f));

		for (int i = 0; i < al.size(); i++) {
			Employee e = al.get(i);
			System.out.println(e.empno + " " + e.name + " " + e.designation + " " + e.salary + " ");
		}

		for (Employee x : al)
			System.out.println(x.empno + " " + x.name + " " + x.designation + " " + x.salary + " ");

		ListIterator<Employee> itr1 = al.listIterator(al.size());
		while (itr1.hasPrevious()) {
			Employee e = itr1.previous();
			System.out.println(e.empno + " " + e.name + " " + e.designation + " " + e.salary + " ");
		}

	}

}
