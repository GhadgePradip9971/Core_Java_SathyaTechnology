package simple;
import java.util.*;
public class Transport {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int age,total,bf,tf,gst,cgst;
		
		String city,interacity,intercity;
	
		String aadharno;
		System.out.println("enter your gender");
		char ch=sc.next().charAt(0);
		
		System.out.println("enter your age=");
		age=sc.nextInt();
		
		
		
		System.out.println("Enter city=");
		city=sc.next();
		
		System.out.println("Enter the addhar no(yes/no)=");
		aadharno=sc.next();
		
		if(ch=='f' && aadharno.equals("yes") ) {
			System.out.println("you basefare is free");
		}
		 if(ch=='f' || ch=='m' && age>=12)
		 {
			 System.out.println("");
		 }
		
		
		
		

	}

}
