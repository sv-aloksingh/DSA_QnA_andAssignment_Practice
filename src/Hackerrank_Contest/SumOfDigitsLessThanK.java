package Hackerrank_Contest;
import java.io.*;
import java.util.*;

public class SumOfDigitsLessThanK {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		//https://www.hackerrank.com/contests/learnyard-jan-2024/challenges/sum-of-digits-less-than-k
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i <A.length;i++)
        {
        	A[i] = sc.nextInt();
        }
        
        int count = 0; 
        for (int i = 0; i < A.length;i++)
        {
        	if (IsDigitSumGreaterThenK(A[i], K))
        		count++;
        }
        System.out.print(count);
    }
    
    public static boolean IsDigitSumGreaterThenK(int num, int K)
    {
    	int digitSum = 0;
    	boolean result = false;
    	while (num > 0)
    	{
    		digitSum = digitSum + num%10;
    		num = num/10;
    	}
    	if (digitSum < K )
    		result = true;
    	return result;
    }
}
