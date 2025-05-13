package Arrays;
import java.util.*;

public class Exchangetwocol {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int i,j,row,col,n1=0,n2=0,temp;
		
	int a[][]=new int[10][10];
	
	System.out.println("Enter 2d array size=");
	row=sc.nextInt();
	col=sc.nextInt();
	
	System.out.print
	("Enter 2d array elements=");
	for(i=0;i<row;i++)
		for(j=0;j<col;j++)
			a[i][j]=sc.nextInt();
	
	System.out.println("Enter the colou7mn need tp be exchanged=");
	n1=sc.nextInt();
	n2=sc.nextInt();

	for(i=0;i<row;i++) {
		temp=a[i] [n1-1];
		a[i] [n1-1]=a[i][n2-1];
		a[i][n2-1]=temp;
	}
	
	for(i=0;i<row;i++) {
		for(j=0;j<col;j++)
			System.out.print(a[i][j]+" ");

	}

System.out.println(" ");
	}
}
