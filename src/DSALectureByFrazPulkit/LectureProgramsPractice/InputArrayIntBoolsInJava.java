package DSALectureByFrazPulkit.LectureProgramsPractice;
import java.util.Scanner;

public class InputArrayIntBoolsInJava {
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		//Input int 
		System.out.println("Enter int val = ");
				int i = sc.nextInt();
				System.out.println("Int output =  ");
				System.out.print(i);
				
				//input boolean
				boolean b = true;
				System.out.println("\n Bool output =  ");
				System.out.print(b);
				
				System.out.println("\n Array output =  ");
				//Array
				int[] arr = new int[3];
				arr = new int[]{1, 3, 5};
				for(int j = 0; j<arr.length;j++)
				{
					System.out.print(arr[j] + " ");
				}
	}
}
