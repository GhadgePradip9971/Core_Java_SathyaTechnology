package collections;

import java.util.Comparator;

public class Salarycomparator implements Comparator {
	public int compare(Object o1, Object o2) {
		Employeeinfo e1 = (Employeeinfo) o1;
		Employeeinfo e2 = (Employeeinfo) o2;

		if (e1.getSalary() > e2.getSalary())
			return 1;
		else
			return -1;

	}

}
