package Arrays;
import java.util.*;
public class Diagonalelement {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a[][]=new int[10][10];
int i,j,row,col,row_size=0,psum=0,osum=0,sum=0;
System.out.println("Enter two 2 dimensional array size");
row=sc.nextInt();
col=sc.nextInt();

System.out.println("Enter two 2 dimensional array element");
for(i=0;i<row;i++) {
	for(j=0;j<col;j++)
		a[i][j]=sc.nextInt();
		
}
for(i=0;i<row;i++) {
	for(j=0;j<col;j++) {
		if(i==j) {
			psum=psum+a[i][j];
			if(i+j==row_size-1)
				osum=osum+a[i][j];
		}
	}
	
	sum=psum+osum;
	
}

System.out.println("sum="+sum);


	}

}
