package Hackerrank_Contest;
import java.util.Scanner;

public class ShiftedStringTransformation {
	public static void main(String[] arg)
	{
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        char[] charA = A.toCharArray();
        char[] charB = B.toCharArray();
        
        
        if (A.length() == B.length())
        {
        	int diff = 0;
            int leftShift = -1;
            String result = "Yes";
        	
        	for (int i = 0; i<A.length(); i++)
        	{
        		diff = charA[i] - charB[i];
        		if (diff < 0)
        			diff = charA[i] - (charB[i] - 26);
        		if (leftShift != -1 && leftShift != diff)
    			{
    				result = "No";
    				break;
    			}
    			leftShift = diff;
        	}
        	System.out.print(result);
        }
	}
}
