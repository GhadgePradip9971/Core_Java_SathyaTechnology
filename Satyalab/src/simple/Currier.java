package simple;
import java.util.*;

public class Currier {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int age;
		String course;
		
		System.out.println("Enter the age=");
		age=sc.nextInt();
		
		System.out.println("Enter the field");
		course=sc.next();
		
	if(age<=18 && course.equals("10")) {
		System.out.println("not allowed any course");
	}
	else if(age>=18 && course.equals("1")) {
		System.out.println("BPO jobs are allowed");
	}
	else if(age>=21 && course.equals("16")) {
		System.out.println("it jobs allowed");
	}
		
	else if(age>=23 && course.equals("16")) {
		System.out.println("enter the red and d solutions in it");
	}
		
	else if(age>=27 && course.equals("12")) {
		System.out.println("phd courses allowed");
	}
	/*else
	{
		System.out.println("not valid age and course");
	}

		*/

	}

}
