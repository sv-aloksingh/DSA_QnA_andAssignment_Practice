package DSALectureByFrazPulkit.LectureProgramsPractice;
import java.util.Scanner;

public class GoodPair {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		for (int i = 0; i < N; ++i)
		{
			arr[i] = sc.nextInt();
		}
		
		int i = 0;
		int countGoodPairs = 0;
		while ( i < N-1)
		{
			for (int startLoop = i+1; startLoop < N; startLoop++)
			{
				if (arr[i] == arr[startLoop])
				{
					countGoodPairs++;
				}
			}
			i++;
		}
		System.out.println(countGoodPairs);
	}
}
