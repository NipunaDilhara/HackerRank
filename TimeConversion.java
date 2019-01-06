import java.io.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion{
	public static void main(String[] args){
		String str1="07:05:45PM",str2="07:05:45AM";
		String arr1[]=str1.split(":");
		String arr2[]=str2.split(":");
		System.out.println(convert(arr1));
		System.out.println(convert(arr2));
	}

	public static String convert(String[] arr){
		Matcher matcher;
		String p1="\\d{2}AM";
		String p2="\\d{2}PM";
		int hour=Integer.parseInt(arr[0]);
		if(Pattern.matches(p2, arr[2])){
			hour+=12;
		}
		return hour+":"+arr[1]+":"+arr[2].substring(0,2);
	}

}
