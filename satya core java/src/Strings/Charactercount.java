package Strings;

public class Charactercount {

	public static void main(String[] args) {
		String s = "aaaaabbbbbbcccc$$$$$$@@@@@@!!!!!!aaaabbbccc&&&77798p";

		int i;
		int a[] = new int[128];// using ascii value a=97 z=127

		for (i = 0; i < s.length(); i++) {
			a[(int) s.charAt(i)]++;

		}

		for (i = 0; i < 128; i++) {
			if (a[i] != 0)
				System.out.println((char) i + "-" + a[i]);
		}

	}

}
