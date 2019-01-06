import java.util.*;

public class PrimeNumbers{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		printStatus(isPrime(num));
		
		System.out.println("---------------------------------------");
		for(int i=1;i<100;i++){
			if(isPrime(i)){
				System.out.print(i+" ");
			}
		}

		System.out.println("---------------------------------------");
		//-------------------------------------------------------
		
		for(int i=1;i<100;i++){
			if(i!=1){
				boolean prime=true;
				for(int j=2;j<i;j++){
					if(i%j==0)
						prime=false;
				}
				if(prime)
					System.out.print(i+" ");
			}

		}
			
		//-------------------------------------------------------

	}

	public static boolean isPrime(int num){
		if(num==1 || num==2){
			return false;
		} else if(num%2==0){
			return false;
		} else{
			for(int i=3;i<num;i=i+2){
				if(num%i==0){
					return false;
				}
			}
			return true;
		}		
	}

	public static void printStatus(boolean status){
		if(status){
			System.out.println("Prime Number");
		} else{
			System.out.println("Not a Prime Number");		
		}

	}

}
