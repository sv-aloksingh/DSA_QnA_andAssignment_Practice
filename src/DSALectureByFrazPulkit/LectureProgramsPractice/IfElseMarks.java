package DSALectureByFrazPulkit.LectureProgramsPractice;
import java.util.Scanner;

public class IfElseMarks {
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		if (num >= 90)
		{
			System.out.println("Excellent");
		}
		else if(num>=80)
		{
			System.out.println("V. Good");
		}
		else if(num>= 50)
		{
			System.out.println("Good");
		}
		else if (num>= 33)
		{
			System.out.println("Pass");
		}
		else 
		{
			System.out.println("Fail");
		}
	}
}
