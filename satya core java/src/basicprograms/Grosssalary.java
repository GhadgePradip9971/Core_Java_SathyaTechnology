package basicprograms;
import java.util.*;

public class Grosssalary {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		double basic_salary,HRA ,DA,Conveyance,Gross_salary;
		System.out.println("Enter the basic salary of an employee");
		basic_salary=sc.nextDouble();
		
		if(basic_salary>=5000)
		{
			DA=(110*basic_salary)/100;
			HRA=(20*basic_salary)/100;
			Conveyance=300;
			
			
		}
		else if (basic_salary>=3000 && basic_salary<=5000)
			
			
			 
		{
			DA=(90*basic_salary)/100;
			HRA=(15*basic_salary)/100;
			Conveyance=300;
			
		}
		else
		{
			DA=(90*basic_salary)/100;
			HRA=(10*basic_salary)/100;
			Conveyance=100;
		}
		Gross_salary=basic_salary+DA+HRA+Conveyance;
		System.out.println("Gross salary of an Employee="+Gross_salary);
		
		
		
		
		
		
		

	}

}
