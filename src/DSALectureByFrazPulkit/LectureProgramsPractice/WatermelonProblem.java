package DSALectureByFrazPulkit.LectureProgramsPractice;
import java.util.Scanner;

public class WatermelonProblem {
	public static void main(String[] args)
	{
		System.out.println("Enter a number to check if watermelon can be divided in two even parts: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num == 2)
		{
			System.out.println("NO");
		}
		else if (num%2 == 0)
		{
			System.out.println("YES");
		}
		else 
		{
			System.out.println("NO");
		}
	}
}
