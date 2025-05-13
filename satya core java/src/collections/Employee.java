package collections;

public class Employee {

	int empno;
	String name;
	String designation;
	float salary;

	public Employee(int empno, String name, String designation, float salary) {
		super();
		this.empno = empno;
		this.name = name;
		this.designation = designation;
		this.salary = salary;

	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", designation=" + designation + ", salary=" + salary
				+ "]";
	}

}
