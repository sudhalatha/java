package testpkge;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String reverse="";
		System.out.println("Enter the input string");
		scanner sc=newscanner(System.in);

		String original = sc.nextline();

		for(int i=original.length()-1; i>=0;i--){
		reverse=reverse+original.charAt(i);
		}
		if(original.equals(reverse)){
		System.out.println("given string is palindrome");
		}
		else{
		System.out.println("given string is not palindrome");
		}
		
		

	}

}
