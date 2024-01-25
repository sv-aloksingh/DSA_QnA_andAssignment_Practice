package DSALectureByFrazPulkit.LectureProgramsPractice;
import java.util.Scanner;

public class PrintFirstAndLastDigitOfNum {
	public static void main(String[] args)
	{
		int num = 1234;
		String str = Integer.toString(num);
		System.out.println(str.charAt(0) + " " + str.charAt(str.length()-1));
	}
}
