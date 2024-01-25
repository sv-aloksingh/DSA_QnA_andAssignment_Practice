package DSALectureByFrazPulkit.LectureProgramsPractice;
import java.awt.image.ColorConvertOp;
import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		var num = sc.nextInt();
		//if (num < 0 )
			//num = num*-1;
		var str = Integer.toString(num);
		boolean isPalin = true;
		if (str.length() <= 1)
			System.out.println(isPalin);
		var lenStr = str.length();
		int i = 0;
		int j = lenStr-1;
		while(i < j)
		{
			if (str.charAt(i) != str.charAt(j))
			{
				isPalin = false;
				break;
			}
			i++;
			j--;
		}
		
		System.out.println(isPalin);
	}
}
