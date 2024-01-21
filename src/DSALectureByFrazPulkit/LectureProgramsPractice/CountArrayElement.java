package DSALectureByFrazPulkit.LectureProgramsPractice;
import java.util.Arrays;
import java.util.Scanner;

public class CountArrayElement {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] arr = new int[N];
		for (int i = 0; i < N; ++i)
		{
			arr[i] = sc.nextInt();
		}
		
		//System.out.println(Arrays.toString(arr));
		
		//X 
		int X = sc.nextInt();
		
		int count = 0;
		for (int i = 0; i < N; ++i)
		{
			if (arr[i] == X)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}