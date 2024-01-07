package DSALectureByFrazPulkit.LectureProgramsPractice;
import java.util.Scanner;

public class EvenOddNumber {
	public static void main(String[] args)
	{
		//Input a number, Check if its even or odd and print it. (it can be any no positive or negative including zero)
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int input = sc.nextInt();
		/*
		if (input == 0) 
		{
			System.out.println("Even");
		} 
		*/
		if (input % 2 == 0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}
}
