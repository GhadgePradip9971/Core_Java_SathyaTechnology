package collections;

import java.util.Comparator;

public class Namecomparator implements Comparator {
	public int compare(Object o1, Object o2) {
		Employeeinfo e1 = (Employeeinfo) o1;
		Employeeinfo e2 = (Employeeinfo) o2;
		return e1.getName().compareTo(e2.getName());
	}

}
