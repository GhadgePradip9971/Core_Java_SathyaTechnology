package Patternslevel2;
import java.util.*;
public class Revrese {

	public static void main(String[] args) {
 Scanner sc=new Scanner (System.in);
 int i,j,n;
 System.out.println("Enter the value of n=");
 n=sc.nextInt();
 /*
 for(i=1;i<=5;i++) {
	 for(j=1;j<=n-i;j++) {
		 System.out.print(" ");
 }
 for(j=1;j<=i;j++) {
	 System.out.print(j);
 }
 System.out.println(" ");
 }
 
 */
 
 for(i=1;i<n;i++) {
	 for(j=1;j<=n-i;j++) {
		 System.out.print(" ");
 }
 for(j=i;j>=1;j--) {
	 System.out.print(j);
 }
 System.out.println(" ");
 }
 
 
 
 
 
 
 
 
 
 
 
	}

}
