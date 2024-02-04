package Hackerrank_Contest;
import java.util.Scanner;

public class AtoZString {
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		
		char[] charArr = S.toCharArray();
		int len = S.length();
		int finalResult = 0;
		int index = indexOf(charArr, 'A', 0);
		if (index != -1)
		{
			for (int i = index; i < len-1;i++)
			{
				int count = 0; 
				for (int j =i+1; j < len;j++)
				{
					if (charArr[i] == 'A' && charArr[j] == 'Z')
					{
						count = j-i+1;
					}
				}
				if (count > finalResult)
					finalResult = count;
			}
		}
		System.out.print(finalResult);
	}
	
	public static int indexOf(char[] array, char target, int startFrom) {
        for (int i = startFrom; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1; // Character not found in the array
    }
}

