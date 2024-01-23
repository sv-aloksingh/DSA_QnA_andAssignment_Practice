package DSALectureByFrazPulkit.LectureProgramsPractice;
import java.util.Scanner;

public class StringBuilderLooping {
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder("Hey Alok Singh");
		for (int i = 0; i < sb.length(); i++)
		{
			System.out.print(sb.charAt(i) + " ");
		}
	}
}
