package simple;
import java.util.*;

public class Discount {

	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 
 double totalbill,bill,disc;
 
 
 char ch;
 System.out.println("Enter your gender=");
 ch=sc.next().charAt(0);
     
 System.out.println("Enter your bill=");
 bill=sc.nextDouble(); 
 
 if(ch=='m') 
 {
	 
   if(bill>=2000 && bill<4000) {
		disc=bill * 0.20;
		totalbill=bill-disc;
		System.out.println(totalbill);
				 
	 }
   else if(bill>=4000 && bill<10000)
   {
	   disc=bill * 0.30;
		totalbill=bill-disc;
		System.out.println(totalbill);
				 
   }
   
   else if(bill>=10000) {
	   disc=bill * 0.40;
		totalbill=bill-disc;
		System.out.println(totalbill);
				 
	   
   }
   
 }
 
 else if(ch=='f'){
	 
	 if(bill>=2000 && bill<4000) {
		 disc=bill * 0.25;
			totalbill=bill-disc;
			System.out.println(totalbill); 
	 }
	 else if(bill>=4000 && bill<10000) {
		 disc=bill * 0.35;
			totalbill=bill-disc;
			System.out.println(totalbill);
		 
	 }
	 else if(bill>=10000) 
	 {
		   disc=bill * 0.45;
			totalbill=bill-disc;
			System.out.println(totalbill); 
	 
	 
 }

 
 
	}

}}
