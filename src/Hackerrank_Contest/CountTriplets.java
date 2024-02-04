package Hackerrank_Contest;
import java.io.*;
import java.util.*;

public class CountTriplets {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] Arr = new int[N];
        for (int i = 0; i <Arr.length;i++)
        {
        	Arr[i] = sc.nextInt();
        }
        
        if (N > 2)
        {
        	System.out.print(CountTriplets(Arr, N));
        }
        else 
        	System.out.print(0);
    }
    
    public static int CountTriplets(int[] Arr, int N)
    {
    	int count = 0;
    	for (int i = 0; i < N-2;i++)
    	{
    		for (int j = i+1; j< N-1; j++)
    		{
    			for (int k = j+1; k < N; k++)
    			{
    				if (Arr[i] != Arr[j] && Arr[j] != Arr[k] && Arr[k] != Arr[i] && getmin(Arr[i], Arr[j], Arr[k]) == true)
    					count++;
    			}
    		}
    	}
    	return count;
    }
    
    public static boolean getmin (int a, int b, int c)
    {
    	int[] array = {a, b, c};
        Arrays.sort(array);

        int sumOfTwoLowest = array[0] + array[1];

        return sumOfTwoLowest > array[2];
    }
}