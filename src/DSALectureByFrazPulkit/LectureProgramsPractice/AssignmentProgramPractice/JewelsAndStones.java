package DSALectureByFrazPulkit.LectureProgramsPractice.AssignmentProgramPractice;
import java.util.Scanner;

public class JewelsAndStones {
	public static void main(String[] arg)
	{
		String jewels = "aA", stones = "aAAbbbb"; //expected output 3 
		System.out.print("Bruteforce result = " + BruteforceApproach(jewels, stones));
		System.out.print("\nOptimal Apprach = " + OptimalApproach(jewels, stones));
	}
	
	public static int BruteforceApproach(String jewels, String stones)
	{
		int count = 0;
		for (int i =0;i< jewels.length();++i)
		{
			for (int j=0; j < stones.length(); ++j)
			{
				if (jewels.charAt(i) == stones.charAt(j))
				{
					count++;
				}
			}
		}
		return count;
	}
	public static int OptimalApproach(String jewels, String stones)
	{
		System.out.println();
		char[] my256charCountArray = new char[256];
		for (int i = 0; i< stones.length(); i++)
		{
			int myCharInts = stones.charAt(i);
			my256charCountArray[myCharInts]++;
		}
		
		int count = 0;
		for (int j = 0; j< jewels.length();++j)
		{
			int jewelsCharIntToFindIn256CharArray = jewels.charAt(j);
			count = count + my256charCountArray[jewelsCharIntToFindIn256CharArray];
			System.out.println(jewels.charAt(j) +" = "+ (int)my256charCountArray[jewelsCharIntToFindIn256CharArray]);
		}
		
		return count;
	}
}
