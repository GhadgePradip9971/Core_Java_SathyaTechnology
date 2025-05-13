package Strings;

public class Stringmethods {

	public static void main(String[] args) {

		String s = "welcome to sathya technology";
		System.out.println(s.charAt(1));
		String s1 = s.concat("Hydrabad");
		System.out.println(s1);

		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++)
			System.out.print(ch[i]);

		System.out.println(s.equals(s1));

		String s2 = "rahul";
		String s3 = "RAHUL";

		System.out.println(s2.equals(s3));

		System.out.println(s2.equalsIgnoreCase(s3));

		System.out.println(s.isEmpty());
		System.out.println(s.length());
		System.out.println(s.substring(4));
		System.out.println(s.indexOf("a"));
		System.out.println(s.lastIndexOf("a"));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());

		String str1[] = s.split(" ");
		for (int i = 0; i < str1.length; i++)
			System.out.println(str1[i]);

		// constructors of string
	}

}
