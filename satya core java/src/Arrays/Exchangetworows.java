package Arrays;
import java.util.*;
public class Exchangetworows {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a[][]=new int[10][10];
int row,col,i,j,n1,n2,temp;

System.out.println("Enter 2 d array size=");
row=sc.nextInt();
col=sc.nextInt();

System.out.println("Enter the 2d array elements=");
for(i=0;i<row;i++) 
	for(j=0;j<col;j++) 
		a[i][j]=sc.nextInt();


System.out.println("Enter the rows to be exchanged=");
n1=sc.nextInt();
n2=sc.nextInt();


for(i=0;i<row;i++) {
	
	temp=a[n1-1][i];
	a[n1-1] [i]=a[n2-1][i];
	a[n2-1][i]=temp;
	
	
}
for(i=0;i<row;i++)
{
	for(j=0;j<col;j++) {
		System.out.print(a[i][j]+" ");
	}
	System.out.println();
}



	

	}

}
