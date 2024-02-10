package DSALectureByFrazPulkit.LectureProgramsPractice;
import java.util.Scanner;

public class FindMaximumSubarraySumBruteforce {
	public static void main(String[] arg)
	{
		int[] arr = new int[] {2,1,8,2,8,9,0,4,5,6,9,8,91,1,1,2,3,4};
		int k = 4;
		int ansS = 0;
		for (int i=0;i+3<arr.length;i++)
		{
			int currS = 0;
			for (int j =i;j<i+k;j++)
			{
				currS = currS + arr[j];
			}
			if (currS > ansS)
			{
				ansS = currS;
			}
		}
		System.out.println(ansS);
	}
}
