package DSALectureByFrazPulkit.LectureProgramsPractice;
import java.util.ArrayList;
import java.util.Scanner;

import SelfJavaLearning.inputAString;

public class ArrayListInJava {
	public static void main(String[] arr)
	{
		ArrayList<Integer> list = new ArrayList();
		AddMe(list, 3);
		AddMe(list, 1);
		AddMe(list, 19);
		AddMe(list, 0);
		AddMe(list, 99);
		AddMe(list, 10);
		list.set(0, 101);
		
		System.out.println(list.get(0));
		
		for(int i =0;i<list.size();i++)
		{
			System.out.print(list.get(i) + " ");
		}
	}
	
	public static void AddMe(ArrayList<Integer> list, int a)
	{
		list.add(a);
	}
	
	public static void RemoveMe(ArrayList<Integer> list, int a)
	{
		list.remove(a);
	}
}
