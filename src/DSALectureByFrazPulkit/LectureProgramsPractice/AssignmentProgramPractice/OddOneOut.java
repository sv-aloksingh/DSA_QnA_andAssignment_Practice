package DSALectureByFrazPulkit.LectureProgramsPractice.AssignmentProgramPractice;
import java.util.Scanner;

public class OddOneOut {
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i =0;i<n;i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			System.out.println();
			if (a == b && a !=c)
				System.out.print(c);
			else if(a==c && a!=b)
				System.out.print(b);
			else if (b == c && b!= a)
				System.out.print(a);
				
		}
	}
}
