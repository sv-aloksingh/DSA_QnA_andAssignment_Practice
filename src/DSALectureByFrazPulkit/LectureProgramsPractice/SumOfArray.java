package DSALectureByFrazPulkit.LectureProgramsPractice;
import java.util.Arrays;
import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		//Declare array data structure where you will store all elements
		int[] arr = new int[N];
		
		//Input N no of elements 
		for (int i = 0; i<N; ++i)
		{
			arr[i] = sc.nextInt();
		}
		
		//print array to check elemnts first 
		//System.out.println(Arrays.toString(arr));
		
		/*
		for (int val: arr)
		{
			System.out.println(val + " ");
		}
		*/
		
		int sum = 0;
		for (int val:arr)
		{
			sum += val;
		}
		System.out.println(sum);
	}
}
