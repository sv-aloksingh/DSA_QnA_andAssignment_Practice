package DSALectureByFrazPulkit.LectureProgramsPractice.AssignmentProgramPractice;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoundNumbers {
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int i = 0;
		int divisor = 1;
		List<Integer> roundNumberList = new ArrayList<Integer>();
		if (num > 9)
		{
			while (num>0)
			{
				divisor = (int)Math.pow(10, i);
				if (num%10 > 0)
				{
					roundNumberList.add(num%10*divisor);
				}
				num = num/10;
				i++;
			}
		}
		else 
		{
			roundNumberList.add(num);
		}
		Print(roundNumberList);
	}
	
	public static void Print(List<Integer> roundNumberList)
	{
		System.out.println(roundNumberList.size());
		for (int i = 0; i < roundNumberList.size();i++)
		{
			System.out.print(roundNumberList.get(i) + " ");
		}
	}
}
