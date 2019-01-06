import java.util.*;


public class ReverseString{
	public static void main(String[] args){
		String str="This is the sentence";
		String revStr="";
		int length=str.length();
		for(int i=0;i<length;i++){
			//System.out.print(str.charAt(length-i-1));
			revStr+=str.charAt(length-i-1);
		}
		System.out.println(revStr);
	}
}
