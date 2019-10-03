package testpkge;

import java.util.Scanner;

public class Sortstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
	        String str;

	        System.out.print("Enter a String :");
	        str = sc.nextLine();

	        int i, j;
	        char temp;

	        char ch[] = str.toCharArray();
	        int l = ch.length;

	        for (i = 0; i < l; i++) {
	            for (j = i + 1; j < l; j++) {
	                if (ch[i] > ch[j]) {
	                    temp = ch[i];
	                    ch[i] = ch[j];
	                    ch[j] = temp;
	                }
	            }
	        }

	        String str1 = String.valueOf(ch);
	        System.out.print("\nSorted String :" + str1);


	}

}
