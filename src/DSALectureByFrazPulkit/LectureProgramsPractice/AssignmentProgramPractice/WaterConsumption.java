package DSALectureByFrazPulkit.LectureProgramsPractice.AssignmentProgramPractice;
import java.util.Scanner;

public class WaterConsumption {
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] A = new int[n];
		for (int i =0;i<n;i++)
		{
			A[i] = sc.nextInt();
		}
		
		Print(A,n);
	}
	
	
	public static void Print(int[] A, int n)
	{
		String drank = "YES";
		for (int i =0;i<n;i++)
		{
			if (A[i]<2000)
			{
				drank = "NO";
			}
			System.out.println(A[i] + " " + drank);
			drank = "YES";
		}
	}
}
