package DSALectureByFrazPulkit.LectureProgramsPractice;
import java.util.Scanner;

public class ReadAllEven1To100 {
	public static void main(String[] args)
	{
		System.out.println("Below is output all even no from 1 to 100: ");
		int startLoopFrom = 1;
		int endLoopTo = 100;
		for (int i = startLoopFrom; i<= endLoopTo; i++)  //can be started from 2 to 100 and increment each time by 2 (once we know even then we can increament by 2)
		{
			if (i % 2 == 0)
			{
				System.out.println(i);
			}
		}
	}
}
