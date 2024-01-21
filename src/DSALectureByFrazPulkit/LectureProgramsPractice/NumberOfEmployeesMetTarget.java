package DSALectureByFrazPulkit.LectureProgramsPractice;
import java.util.Arrays;
import java.util.Scanner;

public class NumberOfEmployeesMetTarget {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] hours = new int[N];
		for (int i = 0; i < N; ++i)
		{
			hours[i] = sc.nextInt();
		}
		
		//System.out.println(Arrays.toString(hours));
		int target = sc.nextInt();
		
		int count = 0;
		for (int i = 0; i < N; i++)
		{
			if (hours[i] >= target)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
