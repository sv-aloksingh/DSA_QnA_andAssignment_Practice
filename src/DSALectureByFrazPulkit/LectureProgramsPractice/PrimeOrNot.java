package DSALectureByFrazPulkit.LectureProgramsPractice;
import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args)
	{
		System.out.println("Check if input no is prime or not: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no to check prime/not = ");
		int N = sc.nextInt();
		if(N == 2) {
			System.out.println("Prime");
			return;
		}
		if (N < 2 || N%2 == 0)
		{
			System.out.println("Not Prime");
			return;
		}
		
		int startDividingNoBy = 2;
		int endDividingNoTo = N-1;
		boolean isNotPrime = false;
		for (int i = startDividingNoBy; i <= endDividingNoTo; i++)
		{
			if (N%i == 0)
			{
				System.out.println("Not Prime");
				isNotPrime = true;
				break;  //instead of break return then it will not go to line 28 at all after loop 
			}
		}
		if (isNotPrime == false)
			System.out.println("Prime");
	}
}
