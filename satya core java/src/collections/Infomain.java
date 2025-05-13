package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

public class Infomain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Employeeinfo> al = new ArrayList<Employeeinfo>();

		int empid[] = { 101, 102, 103, 104, 105, 106 };
		String name[] = { "Sachin", "rahul", "Sehwagh", "yuvi", "msd", "ram" };
		float salary[] = { 3000, 40000, 50000, 100000, 30000, 3000 };
		int deptno[] = { 10, 20, 30, 40, 50, 60 };
		String location[] = { "hud", "ban", "chennai", "mumbai", "banglore", "pune" };

		for (int i = 1; i < empid.length; i++) {

			Employeeinfo e = new Employeeinfo();
			e.setEmpid(empid[i]);
			e.setName(name[i]);
			e.setSalary(salary[i]);
			e.setDeptno(deptno[i]);
			e.setLocation(location[i]);
			al.add(e);
		}
		/*
		 * for (Employeeinfo x : al) { System.out.println(x.getEmpid() + " " +
		 * x.getName() + " " + x.getSalary() + " " + x.getDeptno() + " " +
		 * x.getLocation() + " "); }
		 * 
		 * for (int i = al.size() - 1; i >= 0; i--) {
		 * 
		 * Employeeinfo x = al.get(i);
		 * 
		 * System.out.println(x.getEmpid() + " " + x.getName() + " " + x.getSalary() +
		 * " " + x.getDeptno() + " " + x.getLocation() + " ");
		 * 
		 * }
		 */

		ListIterator<Employeeinfo> litr = al.listIterator(al.size());
		while (litr.hasPrevious()) {
			Employeeinfo x = litr.previous();
			System.out.println(x.getEmpid() + " " + x.getName() + " " + x.getSalary() + " " + x.getDeptno() + " "
					+ x.getLocation() + " ");

		}

		for (Employeeinfo x : al) {
			if (x.getLocation().equals("hydrabad"))
				System.out.println(x.getEmpid() + " " + x.getName() + " " + x.getSalary() + " " + x.getDeptno() + " "
						+ x.getLocation() + " ");

		}

//		for(Employeeinfo x:al) {
//			if(x.getDeptno()==20 || x.getDeptno()==30)
//				System.out.println(x.getEmpid()+ " " + x.getName() + " " + x.getSalary() + " " + x.getDeptno()+ " "+x.getLocation()+" ");
//
//		}
//	

//display the employee details where loaction is not a mumbai
		for (Employeeinfo x : al) {
			if (!(x.getLocation().equals("mumbai")))
				System.out.println(x.getEmpid() + " " + x.getName() + " " + x.getSalary() + " " + x.getDeptno() + " "
						+ x.getLocation() + " ");

		}
//display the employee deatilas  of department 20 and not belong to pune

		for (Employeeinfo x : al) {
			if (x.getDeptno() == 20 && !(x.getLocation()).equals("pune"))
				System.out.println(x.getEmpid() + " " + x.getName() + " " + x.getSalary() + " " + x.getDeptno() + " "
						+ x.getLocation() + " ");

		}

		//
		/*
		 * 
		 * int count = 0; for (Employeeinfo x : al) { if
		 * ((x.getLocation()).equals("pune") || (x.getLocation().equals("mumbai")))
		 * count++; } System.out.println(count);
		 * 
		 * // check whether an employee with the name dhoni present in for (Employeeinfo
		 * x : al) { if (x.getName().equals("virat")) System.out.println(x.getEmpid() +
		 * " " + x.getName() + " " + x.getSalary() + " " + x.getDeptno() + " " +
		 * x.getLocation() + " "); else { System.out.println("no such record found");
		 * break; } }
		 * 
		 * // whose salary is greathe than 30000 for (Employeeinfo x : al) { if
		 * (x.getSalary() > 30000) System.out.println(x.getEmpid() + " " + x.getName() +
		 * " " + x.getSalary() + " " + x.getDeptno() + " " + x.getLocation() + " "); }
		 * 
		 * // salary less than 4000 and not belonging to hyd
		 * 
		 * for (Employeeinfo x : al) { if (x.getSalary() < 4000 &&
		 * !(x.getLocation().equals("hyd"))) System.out.println(x.getEmpid() + " " +
		 * x.getName() + " " + x.getSalary() + " " + x.getDeptno() + " " +
		 * x.getLocation() + " "); }
		 * 
		 * // boolean found = false; for (int i = 0; i < al.size(); i++) { Employeeinfo
		 * x = al.get(i); if (x.getName().equals("dhoni")) {
		 * System.out.println(x.getEmpid() + " " + x.getName() + " " + x.getSalary() +
		 * " " + x.getDeptno() + " " + x.getLocation() + " "); found = true; break; } }
		 * if (!found) System.out.println("no such record found");
		 * 
		 */

		// sorting with salary using comparator

		Collections.sort(al, new Salarycomparator());

		for (Employeeinfo x : al) {
			System.out.println(x.getEmpid() + " " + x.getName() + " " + x.getSalary() + " " + x.getDeptno() + " "
					+ x.getLocation() + " ");
		}

		// sor array with name comparator

		Collections.sort(al, new Namecomparator());
		for (Employeeinfo x : al) {
			System.out.println(x.getEmpid() + " " + x.getName() + " " + x.getSalary() + " " + x.getDeptno() + " "
					+ x.getLocation() + " ");
		}

	}

}
