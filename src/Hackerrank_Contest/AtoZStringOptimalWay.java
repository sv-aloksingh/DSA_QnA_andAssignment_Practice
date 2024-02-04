package Hackerrank_Contest;
import java.util.Scanner;

public class AtoZStringOptimalWay {
	public static void main(String[] arg)
	{
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		
		char[] charArr = S.toCharArray();
		int len = S.length();
		int finalResult = 0;
		int indexofA = indexOf(charArr, 'A');
		int indexofB = indexFromLast(charArr, 'Z');
		
		System.out.print(indexofB-indexofA+1);
	}
	
	public static int indexOf(char[] array, char target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1; // Character not found in the array
    }
	
	public static int indexFromLast(char[] array, char target) {
        for (int i = array.length-1; i > 0; i--) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1; // Character not found in the array
    }
}

