package DSALectureByFrazPulkit.LectureProgramsPractice.AssignmentProgramPractice;
import java.util.Scanner;

public class SumOfRoundNumbers {
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i = 0;
		int multipleOf10 = 1;
		int count = 0;
		while (num > 0)
		{
			multipleOf10 = (int)Math.pow(10, i);
			i++;
			if (num%10 !=  0)
			{
				count++;
				System.out.print(num%10*multipleOf10 + " ");
			}
			num = num/10;
		}
		System.out.println("\n" + count);
	}
}
