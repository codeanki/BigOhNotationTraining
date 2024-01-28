package Training;

import java.util.Scanner;

public class SwapFirstAndLastDigitOfNumber {
	
	public static double power(int x, int n) {
		if(n == 0) {
			return 1;
		}else if(n> 0) {
			return x * power(x,n-1);
		}else {
			return 1/(x * power(x,-n-1));
		}
	}
	
	public static int SwapDigitsOfNumber(int n) {
		int temp = n;
		int count = 0;
		while(temp != 0) {
			temp = temp/10;
			count++;
		}
		int firstDigit = n/(int)power(10,count - 1);
		int lastDigit = n%10;
		int middleTerm = (n % (int)power(10,count-1))/10;
		int swappedNumber = lastDigit * (int)power(10,count - 1) + middleTerm * 10 + firstDigit;
		return swappedNumber;	
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int swappedNumber = SwapDigitsOfNumber(n);
        System.out.println(swappedNumber);
	}
}
