package DSALectureByFrazPulkit.LectureProgramsPractice;
import java.util.Scanner;

public class ArraySortedOrNot1 {
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		for (int i = 0; i < N; ++i)
		{
			arr[i] = sc.nextInt();
		}
		
		//now actual logic for checking if array is sorted already 
		boolean isSorted = true;
		for(int i = 0; i< N-1; i++)
		{
			int currElement = arr[i];
			int nextElement = arr[i+1];
			if (currElement > nextElement)
			{
				isSorted = false;
				break;
			}
		}
		
		System.out.println(isSorted);
	}
}
