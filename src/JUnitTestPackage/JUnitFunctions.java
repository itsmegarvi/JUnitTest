package JUnitTestPackage;
import java.util.Scanner;

public class JUnitFunctions {
	
	static int AddNumbers(int n, int m) {
		return n+m;
	}
	
	
	static String AddStrings(String s1, String s2) {
		String s = s1 + " " + s2;
		return s;
	}
	
	public static void main(String[] args)
	{
	int num1, num2;
	String s1, s2;
	Scanner sc = new Scanner(System.in);

	System.out.println("First number : ");
	num1 = sc.nextInt();

	System.out.println("Second number : ");
	num2 = sc.nextInt();

	AddNumbers(num1, num2);

	System.out.println("First string : ");
	s1 = sc.nextLine();

	System.out.println("Second string : ");
	s2 = sc.nextLine();

	AddStrings(s1, s2);

	sc.close();
	}

}
