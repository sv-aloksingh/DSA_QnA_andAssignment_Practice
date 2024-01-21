package DSALectureByFrazPulkit.LectureProgramsPractice;
import java.util.Scanner;

public class MinMaxOfArray {
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		for (int i = 0; i < N; ++i)
		{
			arr[i] = sc.nextInt();
		}
		
		//Find min and max element 
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for (int i = N-1; i >= 0; --i)
		{
			int currItem = arr[i];
			if (currItem > max)
			{
				max = currItem;
			}
			if (currItem < min)
			{
				min = currItem;
			}
		}
		System.out.println(min + " " + max);
	}
}
