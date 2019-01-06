import java.util.*;

public class Palindrome{
	public static void main(String[] args){
		String str="abbeebba";
		if(checkPalindrome(str)){
			System.out.println("Is a palindrome");
		} else{
			System.out.println("Is not a Palindrome");
		}
		
	
	}

	public static boolean checkPalindrome(String str){
		int fullLength=str.length();
		int halfLength=str.length()/2;

		for(int i=0;i<halfLength;i++){
			if(str.charAt(i)!=str.charAt(fullLength-i-1)){
				return false;
			}
		}
		return true;
	}


}
