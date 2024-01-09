package DSALectureByFrazPulkit.LectureProgramsPractice;
import java.util.Scanner;

public class SumOfDigitEqualToK {
	public static void main(String[] args)
	{
		//Print all numbers from 1 to N which digit sum is equal to K 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no to which we need to check digit sum - enter N = ");
		int N = sc.nextInt();
		System.out.println("Enter no for sum of digit check - ENter K = ");
		int K = sc.nextInt();
		System.out.println("Output:- ");
		for (int i = 1; i<=N;i++)
		{
			if (SumOfDigitEqualToK.SumOfDigit(i) == K)
			{
				System.out.println(i);
			}
		}
	}
	
	public static int SumOfDigit(int N)
	{
		int sum = 0;
		while (N > 0)
		{
			sum = sum + N%10;
			N = N/10;
		}
		return sum;
	}
}
