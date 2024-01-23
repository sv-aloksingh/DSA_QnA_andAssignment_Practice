package DSALectureByFrazPulkit.LectureProgramsPractice;
import java.util.Scanner;

public class SecondSmallest {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		for (int i = 0; i < N; ++i)
		{
			arr[i] = sc.nextInt();
		}
		
		int firstSmallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		for(int i = 0; i< N; i++)
		{
			if(firstSmallest > arr[i])
			{
				firstSmallest = arr[i];
			}
			else if (firstSmallest != arr[i] && arr[i] < secondSmallest)
			{
				secondSmallest = arr[i];
			}
		}
		
		System.out.println(firstSmallest + " " + secondSmallest);
	}
}
