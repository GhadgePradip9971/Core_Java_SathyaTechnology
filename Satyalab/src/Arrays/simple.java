package Arrays;

public class simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,4,-5,-7};
		
		
		int i,product=1;
		for(i=0;i<a.length;i++) {
			System.out.println("array elements="+a[i]);
			System.out.println("Fir5st  elements="+a[0]);
			System.out.println("last elements="+a[3]);
			System.out.println("sum="+(a[0]+a[3]));
			//System.out.println("middle="+middle);
			product=product*a[i];
			System.out.println("square="+(a[i]*a[i]));
			
			
		}
		System.out.println("product="+product);

	}

}
