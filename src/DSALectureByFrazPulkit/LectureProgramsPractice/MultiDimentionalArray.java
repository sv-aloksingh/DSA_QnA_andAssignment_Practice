package DSALectureByFrazPulkit.LectureProgramsPractice;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimentionalArray {
	public static void main(String[] arg)
	{
		int[][] arr = {
				{1,2,3},
				{4,5,6}
		};
		System.out.println(arr.length + " rows.");
		System.out.println(arr[0].length + " columns.");
		
		System.out.println("Here is all elements: ");
		//Print all elements of multi dimensional array
		for (int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		//Print all elements by string 
		for (int i = 0; i< arr.length; i++)
		{
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}
