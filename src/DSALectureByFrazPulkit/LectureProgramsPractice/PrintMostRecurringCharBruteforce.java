package DSALectureByFrazPulkit.LectureProgramsPractice;
import java.util.Arrays;
import java.util.Scanner;

public class PrintMostRecurringCharBruteforce {
	public static void main(String[] arg)
	{
		String str = "ababcdddddefbaa";
		
		char finalFoundChar = (char)-1;
		int finalCount = 0;
		
		for (int i = 0; i < str.length(); i++)
		{
			char foundChar = (char)-1;
			int count = 0;
			for (int j = 0; j < str.length(); j++)
			{
				if (str.charAt(i) == str.charAt(j))
				{
					foundChar = str.charAt(i);
					count++;
				}
			}
			
			if (count > finalCount)
			{
				finalCount = count;
				finalFoundChar = foundChar;
			}
		}
		
		System.out.println( finalFoundChar + " count = " + finalCount );
	}
}
