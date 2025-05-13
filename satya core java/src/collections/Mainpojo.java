package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Mainpojo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Customer> al = new ArrayList<Customer>();
		int i, n;

		System.out.println("Enter the number of customer info=");
		n = sc.nextInt();

		for (i = 1; i <= n; i++) {
			System.out.println("Enter the  customer id=");
			int id = sc.nextInt();
			System.out.println("Enter the  customer name=");
			String name = sc.next();

			System.out.println("Enter the  customer contact no=");
			int Contactno = sc.nextInt();

			System.out.println("Enter the  customer mailid=");
			String Customermailid = sc.next();

			Customer e = new Customer();
			e.setCustomerid(id);
			e.setCustomername(name);
			e.setContactno(Contactno);
			e.setCustomermailid(Customermailid);

			al.add(e);

		}
		for (Customer x : al) {
			System.out.println(x.getCustomerid() + " " + x.getCustomername() + " " + x.getContactno() + " "
					+ x.getCustomermailid() + " ");
		}

	}

}
