package DSALectureByFrazPulkit.LectureProgramsPractice;
import java.util.Scanner;

public class StringComparision {
	public static void main(String[] str)
	{
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		System.out.print(str1.compareTo(str2));
		
		String strInt = sc.next();
		System.out.println(strInt.toString());
		System.out.print(Integer.parseInt(strInt));
	}
}
