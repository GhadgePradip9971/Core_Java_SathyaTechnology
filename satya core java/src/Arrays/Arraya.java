package Arrays;

import java.util.Scanner;

public class Arraya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[10][10];
		int i,j,row,col,row_size=0,psum=0,osum=0,sum=0;
		boolean flag=true;
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
		/*for(i=0;i<row;i++) {
			for(j=0;j<col;j++) {
				if(a[i][j]!=0)
				{
					if(i==j)
					{
						count++;
					}
				}
			}
	}
		if(count==3)
		{
			System.out.println("diagonal matrix");
		}
		else 
		{
			System.out.println("not diagonal matrix");
		}
		
*/
		
		
		for(i=0;i<row;i++) {
			for(j=0;j<col;j++)
				if(i!=j) {
					if(a[i][j]!=0) {
						flag=false;
						break;
					}
					else {
						if(a[i][j]==0) {
							flag=false;
							break;
						}
					}
				}
				
			
		}
		if(flag) 
			System.out.println("diagonal matrix");
		else
			System.out.println("not diagonal matrix");
		
		
}
}
