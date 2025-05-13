package ExceptionHandling;

public class Employee {

	public void m1() {

		System.out.println("m1 method executed");
	}

	public void m2() {
		System.out.println("this is a method");

	}

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.m1();
		e1.m2();

	}

}
