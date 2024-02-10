package DSALectureByFrazPulkit.LectureProgramsPractice;
import java.util.Scanner;

public class MaxConsecutiveOnesOptimal {
	public static void main(String[] arg)
	{
		int[] arr = new int[] {1,1,0,1,0,0,1,1,0,1,1,1,1,0,1};
		
		int ansC = 0;
		int currC = 0;
		for (int i =0;i<arr.length;i++)
		{
			currC++;
			if (arr[i] == 0)
			{
				currC = 0;
			}
			
			if (currC > ansC)
			{
				ansC = currC;
			}
		}
		
		System.out.println(ansC);
	}
}
