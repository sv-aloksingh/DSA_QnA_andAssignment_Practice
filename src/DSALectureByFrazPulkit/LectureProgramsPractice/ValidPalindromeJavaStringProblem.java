package DSALectureByFrazPulkit.LectureProgramsPractice;
import java.util.Scanner;

public class ValidPalindromeJavaStringProblem {
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		var str = sc.nextLine();
		str = str.toLowerCase();
		var isPalin = true;
		//Get a stringBuilder for actual string on which palindrome need to be checked
		//Stringbuilder because we need to modify string many times as we find small chars
		StringBuilder checkPalindromOnThisString = new StringBuilder();
		var strLen = str.length() - 1;
		while (strLen >= 0)
		{
			if ((int)str.charAt(strLen) >= 97 && (int)str.charAt(strLen) <= 122)
			{
				checkPalindromOnThisString.append(str.charAt(strLen));
			}
			strLen--;
		}
		System.out.println(checkPalindromOnThisString);
	}
}
