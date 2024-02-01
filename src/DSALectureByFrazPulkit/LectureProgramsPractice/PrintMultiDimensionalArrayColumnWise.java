package DSALectureByFrazPulkit.LectureProgramsPractice;
import java.util.Scanner;

public class PrintMultiDimensionalArrayColumnWise {
	public static void main(String[] args)
	{
		int[][] arr = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		
		System.out.println("Print multi dimensional array row wise:- ");
		//Print row wise 
		for (int i =0; i<arr.length; i++)
		{
			for (int j = 0;j<arr[0].length; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Print multi dimensional array column wise:- ");
		//Print column wise 
		for (int i = 0;i<arr[0].length;i++)
		{
			for (int j =0; j< arr.length; j++)
			{
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
	}
}
