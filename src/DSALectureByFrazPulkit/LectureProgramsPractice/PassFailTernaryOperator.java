package DSALectureByFrazPulkit.LectureProgramsPractice;
import java.util.Scanner;

public class PassFailTernaryOperator {
	public static void main(String[] args)
	{
		System.out.println("Enter a number :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String str =  (num >= 33) ? "Passed" : "Fail";
		System.out.println(str);
		/*
		if (num >= 33)
		{
			System.out.println("Pass");
		}
		else 
		{
			System.out.println("Fail");
		}
		*/
	}
}
