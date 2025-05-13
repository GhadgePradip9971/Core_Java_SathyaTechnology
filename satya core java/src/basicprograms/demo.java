package basicprograms;
import java.util.*;

public class demo {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int current,previous,total_units;
		float e_bill;
		
		System.out.println("Enter units details :");
		System.out.println("Enter Current units= ");
		current=sc.nextInt();
		System.out.println("Enter previos  units= ");
		previous=sc.nextInt();
		
		total_units=current-previous;
		System.out.println("Total units:"+total_units);
		
		if(total_units>=0 && total_units<100)
			e_bill=total_units*0.8f;
		
		else if(total_units >=100 && total_units <200)
			e_bill=80+(total_units-100)*1.2f;
		
		else if(total_units >=200 && total_units <300)
			e_bill=200+(total_units-200)*1.5f;
		
		else
			e_bill=350+(total_units-300)*1.8f;
		
		System.out.println("Electricity Bill="+e_bill);
		
		
		

	}

}
