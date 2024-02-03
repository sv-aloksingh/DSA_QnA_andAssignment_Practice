package DSALectureByFrazPulkit.LectureProgramsPractice.AssignmentProgramPractice;
import java.util.Scanner;

public class UglyNumbers {
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		boolean isUgly = true;
		for (int i = 2; i<=a/2;i++)
		{
			if (a%i == 0)
			{
				if (!(i == 2 || i == 3 || i==5))
				{
					isUgly = false;
					break;
				}
			}
		}
		System.out.println(isUgly);
	}
}
