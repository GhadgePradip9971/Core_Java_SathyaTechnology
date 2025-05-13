package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Employee> al = new ArrayList<Employee>(); // value taking from user using scanner class

		while (true) {

			{
				System.out.println("Enter the employye id=");
				int empno = sc.nextInt();
				System.out.println("Enter the employee name=");
				String name = sc.next();
				System.out.println("Enter the  employye designation =");
				String designation = sc.next();

				System.out.println("Enter the employye salary=");
				float salary = sc.nextFloat();

				Employee e = new Employee(empno, name, designation, salary);
				al.add(e);
				System.out.println("do you want to continue=");
				String choice = sc.next();
				if (choice.equals("no"))
					break;

			}

			for (Employee x : al) {
				System.out.println(x.empno + " " + x.name + " " + x.designation + " " + x.salary + " ");
			}

		}

	}
}
