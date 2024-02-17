package DSALectureByFrazPulkit.LectureProgramsPractice;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetInJava {
	public static void main(String[] arg)
	{
		Set<Integer> rollNum = new HashSet<Integer>();
		rollNum.add(201);
		rollNum.add(101);
		rollNum.add(271);
		
		if (rollNum.contains(101))
			System.out.print("True");
	}
}
