package DSALectureByFrazPulkit.LectureProgramsPractice;
import java.util.Scanner;

public class FunctionInJava {
	public static void main(String[] arg)
	{
		Pranam();
		System.out.println(FunctionInJava.GetSum(3, 6));
		
		FunctionInJava obj = new FunctionInJava();
		obj.NamasteAk();
	}
	
	public static void Pranam()
	{
		System.out.println("Hey Pranam");
	}
	
	public static int GetSum(int a, int b)
	{
		return a+b;
	}
	
	public void NamasteAk()
	{
		System.out.println("Ak");
	}
}
