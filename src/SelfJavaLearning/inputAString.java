package SelfJavaLearning;
import java.util.Scanner;

public class inputAString {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		System.out.println("Entered string = " + str);
	}
}
