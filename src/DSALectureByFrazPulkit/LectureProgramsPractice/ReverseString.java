package DSALectureByFrazPulkit.LectureProgramsPractice;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {
	public static void main(String[] arg)
	{
		String[] strArr = new String[] {"h","e","l","l","o"};
		System.out.println("Before reverse = " + Arrays.toString(strArr));
		var len = strArr.length;
		int i = 0;
		int j = len-1;
		while (i < j)
		{
			var temp = strArr[i];
			strArr[i] = strArr[j];
			strArr[j] = temp;
			i++;
			j--;
		}
		System.out.println("After reverse = " + Arrays.toString(strArr));
	}
}
