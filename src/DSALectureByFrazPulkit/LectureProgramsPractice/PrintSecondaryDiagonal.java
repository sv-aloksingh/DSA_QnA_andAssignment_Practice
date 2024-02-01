package DSALectureByFrazPulkit.LectureProgramsPractice;
import java.util.Scanner;

public class PrintSecondaryDiagonal {
	public static void main(String[] arg)
	{
		//Print secondary diagonal element of square matrix 
		int[][] arr = {
								{1,2,3,4},
								{5,6,7,8},
								{9,10,11,12},
								{13,14,15,16}
				};
		if (arr.length != arr[0].length)
		{
			System.out.println();
		}
		
		for (int i = 0; i< arr.length;i++)
		{
			for(int j = arr.length-1;j>=0;j--)
			{
				if (i+j == arr.length-1)
				{
					System.out.print(arr[i][j] + " ");
				}
			}
		}
	}
}
