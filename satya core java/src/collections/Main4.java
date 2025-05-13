package collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main4 {

	public static void main(String[] args) throws IOException {
//using buffer reader class

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Employee> al = new ArrayList<Employee>();
		int i, n;

		System.out.println(" Enter the number of Employeee info=");
		n = Integer.parseInt(br.readLine());
		for (i = 1; i <= n; i++) {

			System.out.println("Enter the employye id=");
			int empno = Integer.parseInt(br.readLine());

			System.out.println("Enter the employee name=");
			String name = br.readLine();
			System.out.println("Enter the  employye designation =");
			String designation = br.readLine();

			System.out.println("Enter the employye salary=");
			float salary = Float.parseFloat(br.readLine());

			Employee e = new Employee(empno, name, designation, salary);
			al.add(e);

		}

		for (Employee x : al) {
			System.out.println(x.empno + " " + x.name + " " + x.designation + " " + x.salary + " ");
		}
	}

}
