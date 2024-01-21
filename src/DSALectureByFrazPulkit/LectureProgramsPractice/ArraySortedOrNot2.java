package DSALectureByFrazPulkit.LectureProgramsPractice;
import java.util.Scanner;

public class ArraySortedOrNot2 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		//create int array of size N
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		boolean isSorted = true;
		//check from last elements 
		for (int i = N-1; i>0; --i)
		{
			int curr = arr[i];
			int prev = arr[i-1];
			if (curr < prev)
			{
				isSorted = false;
				break;
			}
		}
		System.out.println(isSorted);
	}
}
