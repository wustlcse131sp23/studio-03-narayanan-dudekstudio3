package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("To what number do u want to find all the prime numbers? ");
		int n = in.nextInt();
		int [] numberSet = new  int [n+1];
		boolean [] prime = new boolean [n+1];
		
		for (int i = 0; i < prime.length; i++) {
			prime[i] = true;
		}
		
		for (int i = 2; i <= numberSet.length; i++) {
			for (int j = i + i; j <= n; j += i) {
				prime [j] = false;
			}
		}

		for (int i =0; i<prime.length; i++) {
			if (prime[i] == true) {
				System.out.print(i + ", ");
			}
		
		}
		
		
		
		
		
	}

}
