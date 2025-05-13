/*write a java program to find the average of six subject marks of the student and display the result as follows
average              result      
>=35 &<=50                 thirde div
>=50 & <60                     2nd divi
 >=60 & <75                   first        Distinction
       >=75                       dist   
 if any marks of six subject is less than 35 the result is fail
 
 */
package basicprograms;
import java.util.*;
public class Subject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m1,m2,m3,m4,m5,m6,total;
		float avg;
		Scanner sc=new Scanner (System.in);
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		m4=sc.nextInt();
		m5=sc.nextInt();
		m6=sc.nextInt();
	total=m1+m2+m3+m4+m5+m6;
	System.out.println("Total Marks="+total);
	avg=total/6.0f;
	
	if(m1<35||m2<35||m3<35||m4<35||m5<35||m6<35)
		System.out.print("Fail5");
	else if (avg>=35 && avg<50)
		System.out.println("Third Division");
	else if (avg>=50 && avg<60)
		System.out.println("First Division");
	else if (avg>=60 && avg<75)
		System.out.println("First Division");
	else
		System.out.println("Distinction");
		
	
		
		
		

	}

}
