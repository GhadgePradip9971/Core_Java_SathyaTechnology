package basicprograms;
import java.util.*;

public class Conversion {
	public static void main(String args[]) {
		Scanner sc=new Scanner (System.in);
		System.out.println("****************YEAR CONVERTER*************");
		System.out.println("1:MONTHS");
		System.out.println("2:DAYS");
		System.out.println("3:HOURS");
		System.out.println("4:MINUTES");
		System.out.println("5:SECOUNDS");
		
		int months,years,days,hours,minutes,secounds;
		int choice=0;
		
		System.out.println("Enter the years=");
		years=sc.nextInt();
		
		System.out.println("Enter the choice=");
		years=sc.nextInt();
		
		months=years*12;
		days=months*30;//yrs*365
		hours=days*24;
		minutes=hours*60;
		secounds=minutes*60;
		
		switch(choice) 
		{
		case 1:System.out.println("numnber of  months="+months);
			   break;
			
		case 2:
			System.out.println("numnber of  days="+days);
			break;
			
		case 3:
			System.out.println("numnber of  hours="+hours);
			break;
			
		case 4:
			System.out.println("numnber of  minutes="+minutes);
			break;
			
		case 5:
			System.out.println("numnber of  secounds="+secounds);
			break;
			
			
			default:
		
				System.out.println("Invalid choice ");
				
			
		}
		
		
		
		
		
		
	}

}
