package Arrays;
import java.util.*;

public class Sortingeachrow {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int i,j,k,row,col,temp;
int a[][]=new int[10][10];

System.out.println("Enter 2d array size=");
row=sc.nextInt();
col=sc.nextInt();

System.out.println("enter 2d array elements");
for(i=0;i<row;i++)
	for(j=0;j<col;j++)
		a[i][j]=sc.nextInt();


for(i=0;i<row;i++) {
	for(j=0;j<col;j++) {
		for(k=j+1;k<col;k++) {
			if(a[i][j]>a[i][k])
			{
				temp=a[i][j];
				a[i][j]=a[i][k];
				a[i][k]=temp;
			}
			
	}
	}


}
for(i=0;i<row;i++) {
	for(j=0;j<col;j++) {
		System.out.println(a[i][j]+ " ");
		
	}
}
	}

}
