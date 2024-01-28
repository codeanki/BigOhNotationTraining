package Training;

import java.util.Scanner;

public class LargestNumberWithAllDigitsAsPrime {
	
	public static boolean isPrime(int n) {
		if(n == 0 || n == 1) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int  LargestNumberDigitsPrime(int n) {
		for(int i=n-1;i>=2;i--) {
			int temp = i;
			boolean AllDigitsPrime = true;
			while(temp > 0) {
				int digit = temp%10;
				if(!isPrime(digit)) {
					AllDigitsPrime = false;
					break;
				}
				temp = temp / 10;
			}
			if(AllDigitsPrime) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int largestPrime = LargestNumberDigitsPrime(n);
		System.out.print(largestPrime);
	}

}
