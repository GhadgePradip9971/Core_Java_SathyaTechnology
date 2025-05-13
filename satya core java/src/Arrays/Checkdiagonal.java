package Arrays;
import java.util.*;
public class Checkdiagonal {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a[][]=new int[10][10];
int i,j,row,col;

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
		if(i>j && i<j) {
			System.out.println("0");
		}
	}
}


	}

}
