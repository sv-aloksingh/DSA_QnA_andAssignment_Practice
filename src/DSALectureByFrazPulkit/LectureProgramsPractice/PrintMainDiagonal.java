package DSALectureByFrazPulkit.LectureProgramsPractice;
import java.util.Scanner;

public class PrintMainDiagonal {
	public static void main(String[] args)
	{
		//Print main diagonal element of square matrix 
		int[][] arr = {
						{1,2,3,4},
						{5,6,7,8},
						{9,10,11,12},
						{13,14,15,16}
		};
		
		System.out.println("Print all element of main diagonal: single loops ");
		//Main diagonal array with one 
		for (int i =0; i<arr.length; i++)
		{
			System.out.print(arr[i][i] + "   ");
		}
		
		
		System.out.println("\n\nPrint all element of main diagonal: two loops ");
		//With two loops 
		for (int i =0;i<arr.length;i++)
		{
			for (int j=0;j<arr.length;j++)
			{
				if (i==j)
				{
					System.out.print(arr[i][j] + "  ");
				}
			}
		}
	}
}
