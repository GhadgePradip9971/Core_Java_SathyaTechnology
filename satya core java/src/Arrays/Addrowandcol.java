package Arrays;
import java.util.*;

public class Addrowandcol {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int i,j,row,col,rsum=0,csum=0;
int a[][]=new int[10][10];

System.out.println("Enter two 2 dimensional array size");
row=sc.nextInt();
col=sc.nextInt();

System.out.println("Enter two 2 dimensional array element");
for(i=0;i<row;i++) {
	for(j=0;j<col;j++)
		a[i][j]=sc.nextInt();
		
}
for(i=0;i<row;i++) {
	rsum=0;
	for(j=0;j<col;j++) {
		rsum=rsum+a[i][j];
	}
	System.out.println("rsum="+rsum);
}

for(i=0;i<row;i++) {
	csum=0;
	for(j=0;j<col;j++) {
		csum=csum+a[j][i];
	}
	System.out.println("csum="+csum);
}





	}

}
