package DSALectureByFrazPulkit.LectureProgramsPractice.AssignmentProgramPractice;
import java.util.Scanner;

public class ToLowerCase {
	public static void main(String[] arg)
	{
		System.out.println(ToLowerCase.toLowerCase("Alok Singh"));
		System.out.println(ToLowerCase.toLowerCase2("Alok Singh LLL"));
	}
	
	public static String toLowerCase(String s) {
        return s.toLowerCase();
    }
	
	public static String toLowerCase2(String s) {
		char[] ch = s.toCharArray();
		for (int i=0; i< s.length();++i)
		{
			if (ch[i]>=65 && ch[i]<=90)
			{
				int lowerIt = ch[i]+32;
				ch[i] = (char)lowerIt;
			}
		}
        return new String(ch);
    }
}
