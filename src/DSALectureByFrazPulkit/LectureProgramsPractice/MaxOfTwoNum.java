package DSALectureByFrazPulkit.LectureProgramsPractice;
import java.util.Scanner;

public class MaxOfTwoNum {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no : ");
		int a = sc.nextInt();
		System.out.println("Enter second no : ");
		int b = sc.nextInt();
		System.out.println("Below is output(max/equal): ");
		if (a == b)
		{
			System.out.println("Equal");
		}
		else if (a > b)
		{
			System.out.println(a);
		}
		else
		{
			System.out.println(b);
		}
	}
}
