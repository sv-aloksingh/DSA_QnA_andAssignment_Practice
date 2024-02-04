package Hackerrank_Contest;
import java.io.*;
import java.util.*;

public class MaximizeArrayOperations {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        
        for (int i = 0; i <N;i++)
        {
        	A[i] = sc.nextInt();
        }
       
        int[] result = new int[N]; 
        //Get minimum number of factors of 2 for each element 
        for (int i = 0; i <N; i++)
        {
        	int count = 0;
        	while (A[i]%2 == 0)
        	{
        		count++;
        		A[i]=A[i]/2;
        	}
        	result[i] = count;
        }

        int minValue = result[0]; 
        for (int i = 1; i < result.length; i++) {
            if (result[i] < minValue) {
                minValue = result[i]; // Update the minimum value
            }
        }
        
        System.out.print(minValue);
    }
}
