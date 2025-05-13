package ExceptionHandling;

public class Exception {

	public static void main(String[] args) {

		System.out.println("Start execution");
		try {
			String str = "sathya";
			System.out.println(str.length());
			System.out.println(str.charAt(1));
			System.out.println(str.charAt(6));
		} catch (StringIndexOutOfBoundsException op) {
			System.out.println("StringIndexOutOfBoundsException handled succesfully");

		}

		System.out.println("Execution Succesfull");
	}

}
