package DSALectureByFrazPulkit.LectureProgramsPractice;
import java.util.Arrays;
import java.util.Scanner;

public class StringInputInJava {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//Immutable string 
		//sc.next() takes input till space or new line 
		//String str = sc.next();
		//System.out.println(str);
		
		//Second time input through nextLine 
		String strViaNextLine = sc.nextLine(); 
		System.out.println(strViaNextLine);
		
		System.out.println("String length = " + strViaNextLine.length());
		System.out.println("String length = " + strViaNextLine.charAt(3));
		System.out.println("String length = " + strViaNextLine.substring(3,7));
		System.out.println("String length = " + strViaNextLine.substring(3));
		System.out.println("String length = " + strViaNextLine.trim());
		System.out.println("String length = " + strViaNextLine.contains("Alok"));
		System.out.println("String length = " + strViaNextLine.contains("alok"));
		String[] strArr = strViaNextLine.split(" ");
		System.out.println(Arrays.toString(strArr));
	}
}
