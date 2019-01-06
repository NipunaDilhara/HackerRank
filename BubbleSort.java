import java.util.*;

public class BubbleSort{
	public static void main(String[] args){
		int[] arr=new int[]{5,3,6,19,8,14,25,20};
		int lastUnsorted=arr.length-1;
		boolean isSorted=false;

		while(!isSorted){
			isSorted=true;
			for(int i=0;i<lastUnsorted-1;i++){
				if(arr[i]>arr[i+1]){
					isSorted=false;
					swap(arr, i, i+1);
				}
		
			}
			lastUnsorted--;
		}

		for(int i:arr){
			System.out.print(i+" ");
		}
	}
	
	public static void swap(int[] arr, int i, int j){
		int temp=arr[i];
		arr[i]=arr[i+1];
		arr[i+1]=temp;
	}



}
