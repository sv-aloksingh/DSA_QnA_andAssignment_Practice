package DSALectureByFrazPulkit.LectureProgramsPractice;
import java.util.Scanner;

public class MaxConsecutiveOnesBruteforce {
	public static void main(String[] arg)
	{
		int[] arr = new int[] {1,1,0,1,0,0,1,1,0,1,1,1,1,0,1};
		int ansC = 0;
		for (int i = 0;i<arr.length;i++)
		{
			int currC = 0;
			for(int j=i;j<arr.length;j++)
			{
				if (arr[j] == 0)
				{
					//i = j; uncomment this also will work
					break;
				}
				currC++;
			}
			if (currC > ansC)
			{
				ansC = currC;
			}
		}
		System.out.println(ansC);
	}
}
