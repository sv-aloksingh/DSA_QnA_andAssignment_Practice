package DSALectureByFrazPulkit.LectureProgramsPractice;

import java.util.Scanner;

public class PetyaAndStrings {
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		
		String ans = "0";
		int len = str1.length()-1;
		if (str1.equalsIgnoreCase(str2))
			System.out.println(ans);
		else {
			String s1 = str1.toLowerCase();
			String s2 = str2.toLowerCase();
			while (len >= 0)
			{
				if ((int)s1.charAt(len) < (int)s2.charAt(len))
				{
					ans = "-1";
					break;
				}
				else if ((int)s1.charAt(len) > (int)s2.charAt(len))
				{
					ans = "1";
					break;
				}
					
				len--;
			}
			System.out.println(ans);
		}
	}
}
