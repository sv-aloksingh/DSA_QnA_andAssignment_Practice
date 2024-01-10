package DSALectureByFrazPulkit.LectureProgramsPractice;
import java.util.Scanner;

public class PrimeNoOrNot {
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		boolean isPrime = true;
		if (N == 2)
			System.out.println(N);
		for (int i = 2; i < N; i++)
		{
			if (N%i == 0)
			{
				isPrime = false;
				break;
			}
		}
		System.out.println(isPrime);
	}
}
