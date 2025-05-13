package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Employee> al = new ArrayList<Employee>();
		int empno[] = { 101, 102, 103, 104, 105 };
		String name[] = { "sachin", "kapil", "rahul", "dhoni", "yuvi" };
		String designation[] = { "programmer", "Anaylyast", "tester", "architect", "manager" };
		float salary[] = { 2500, 3500, 40000, 23000, 45000 };

		for (int i = 0; i < empno.length; i++) {
			Employee e = new Employee(empno[i], name[i], designation[i], salary[i]);
			al.add(e);

		}

		for (Employee x : al) {
			System.out.println(x.empno + " " + x.name + " " + x.designation + " " + x.salary + " ");
		}

	}

}
