package Patternslevel2;
import java.util.*;

public class Stars {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int i,j,n;

System.out.print("Enter the value of n=");
n=sc.nextInt();



for(i=1;i<=5;i++) {
	for(j=1;j<=5-i;j++)
		System.out.print(" ");
	
	for(j=1;j<=2*i-1;j++)
		System.out.print("*");
	System.out.println(" ");
}
for(i=n-1;i>=1;i--) {
	for(j=1;j<=5-i;j++)
		System.out.print(" ");
	
	for(j=1;j<=2*i-1;j++)
		System.out.print("*");
	System.out.println(" ");
}











	}

}
