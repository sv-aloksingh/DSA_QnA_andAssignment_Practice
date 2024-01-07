package DSALectureByFrazPulkit.LectureProgramsPractice;
import java.util.Scanner;

public class MaxOf3Number {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no :");
		int a = sc.nextInt();
		System.out.println("Enter second no :");
		int b = sc.nextInt();
		System.out.println("Enter third no :");
		int c = sc.nextInt();
		
		System.out.println("Result :");
		if (a >= b && a >= c)
		{
			System.out.println(a);
		}
		else if (b >= a && b>=c)
		{
			System.out.println(b);
		}
		else 
		{
			System.out.println(c);
		}
	}
}
