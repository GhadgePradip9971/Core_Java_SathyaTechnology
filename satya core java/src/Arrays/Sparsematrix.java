package Arrays;
import java.util.*;
public class Sparsematrix {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a[][]=new int[10][10];
int i,j,row,col	;

System.out.println("Enter two 2 dimensional array size");
row=sc.nextInt();
col=sc.nextInt();
 int count=0;
System.out.println("Enter two 2 dimensional array element");
for(i=0;i<row;i++) {
	for(j=0;j<col;j++) {
		a[i][j]=sc.nextInt();
	}	
}




	}

}
