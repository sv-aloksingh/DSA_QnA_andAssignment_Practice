package DSALectureByFrazPulkit.LectureProgramsPractice.AssignmentProgramPractice;
import java.util.Scanner;

public class PrintPattern {
	public static void main(String[] arg)
	{
		int n = 5;
		int p = 1;
		for (int i =0; i < n; i++)
		{
			for (int j=0; j< n; j++)
			{
				System.out.print(p);
			}
			if (p == 1)
				p = 0;
			else
				p = 1;
			System.out.println();
		}
	}
}
