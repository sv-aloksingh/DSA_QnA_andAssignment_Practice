package DSALectureByFrazPulkit.LectureProgramsPractice;
import java.util.Scanner;

public class PrintSumOfFirstAndLastDigitNum {
	public static void main(String[] arg)
	{
		int num = 1234;
		String strNum = Integer.toString(num);
		int firstDig = strNum.charAt(0) - '0';
		int lastDig = strNum.charAt(strNum.length()-1) - '0';
		
		System.out.println(firstDig + lastDig);
	}
}
