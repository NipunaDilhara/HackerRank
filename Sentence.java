import java.util.*;

public class Sentence{
	public static void main(String[] args){
		String str="thisIsASampleSentence";
		String finalSentence="";
		int length=str.length();
		str=str.substring(0,1).toUpperCase()+str.substring(1);
		int pointer=0;
		for(int i=1;i<length;i++){
			if(Character.isUpperCase(str.charAt(i))){
				finalSentence+=(str.substring(pointer,i)+" ");
				pointer=i;
			}
		}
		finalSentence+=str.substring(pointer);
		System.out.println(finalSentence);
	}
}
