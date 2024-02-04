package Hackerrank_Contest;
import java.io.*;
import java.util.*;

public class WaterReflection {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] A = new int[N][M];
        for (int i = 0; i <N;i++)
        {
        	for (int j =0;j<M;j++)
        	{
        		A[i][j] = sc.nextInt();
        	}
        }
        
        for (int i =N-1;i>=0;i--)
        {
        	for (int j =0;j<M;j++)
        	{
        		System.out.print(A[i][j] + " ");
        	}
        	System.out.println();
        }
    }
}
