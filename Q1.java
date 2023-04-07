package Assignment1;

import java.util.Scanner;

public class Q1 {
	static boolean isPrime(int n,int i) {
		if(i==n)
			return true;
		if(n%i==0)
			return false;
		return isPrime(n,i+1);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		System.out.println(n+" is prime: "+isPrime(n,2));

	}

}
