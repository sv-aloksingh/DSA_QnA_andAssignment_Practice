package DSALectureByFrazPulkit.LectureProgramsPractice;
import java.util.Scanner;

public class PrintNnoWhichSumOfDigitK {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int target_count = sc.nextInt();
		int target_sum = sc.nextInt();
		
		int curr_count = 0, curr_counterI = 0;
		
		System.out.println("Output: ");
		while(curr_count < target_count)
		{
			//Sum of digit code 
			int curr_digit_sum = 0;
			for (int num = curr_counterI; num > 0; num = num/10)
			{
				curr_digit_sum = curr_digit_sum + num %10;
			}
			
			if (curr_digit_sum == target_sum)
			{
				System.out.println(curr_counterI);
				curr_count++;
			}

			curr_counterI++;
		}
		
		sc.close();
	}
}
