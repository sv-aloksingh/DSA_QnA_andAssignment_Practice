package DSALectureByFrazPulkit.LectureProgramsPractice;
import java.util.Scanner;

public class PrintMostRecurringCharOptimal {
	public static void main(String[] arg)
	{
		String str = "ababcdddddefbaa";
		int[] freq = new int[256];
		
		//add chars in freq
		for (int i = 0; i < str.length(); ++i)
		{
			int intOfChar = str.charAt(i);
			freq[intOfChar]++;
		}
		
		int charIntVal = -1;
		int countOfChar = -1;
		//print max now 
		for (int i = 0 ; i < 256; ++i)
		{
			if (freq[i] > countOfChar)
			{
				countOfChar = freq[i];
				charIntVal = i;
			}
		}
		
		System.out.println((char)charIntVal + " count = " + countOfChar);
	}
}
