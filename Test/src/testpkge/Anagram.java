package testpkge;

import java.util.Arrays;

public class Anagram {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 ="java";
		String str2 ="avaj";
		System.out.println("Both strings are anagrams" +anagramCheck(str1,str2));

	}

	
	public static boolean anagramCheck(String str1, String str2){

		char[] charArrayFromString1=str1.toCharArray();
		char[] charArrayFromString2=str2.toCharArray();
		Arrays.sort(charArrayFormString1);
		Arrays.sort(charArrayFormString2);
		return Arrays.equals(charArrayFormString1, charArrayFormString2);
		}

		}

