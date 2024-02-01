package DSALectureByFrazPulkit.LectureProgramsPractice.AssignmentProgramPractice;
import java.util.Scanner;

public class CountAsterisks {
	public static void main(String[] arg)
	{
		String s = "l|*e*et|c**o|*de|";
		int count = 0;
		for (int i = 0; i < s.length();i++)
		{
			if (s.charAt(i) == '|')
			{
				int j = i+1;
				while (s.charAt(j) != '|' && j < s.length())
				{
					j++;
				}
				//System.out.println(i + " " + j);
				i = j;
			}
			else if (s.charAt(i) == '*')
			{
				++count;
			}
		}
		System.out.println(count);
	}
}
