package DSALectureByFrazPulkit.LectureProgramsPractice;
import java.util.Scanner;

public class StringBuilderInJava {
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder("Hey ");
		System.out.println(sb);
		sb.append("KLOK Singh");
		System.out.println(sb);
		sb.setCharAt(4, 'A');
		System.out.println(sb);
	}
}
