package Training;
import java.util.*;
public class SmallestDivisibleNumber {
	
	public static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}else {
			return gcd(b,a%b);
		}
	}
	
	public static int lcm(int a, int b) {
		return (a*b)/gcd(a,b);
	}
	
	public static int findSmallestDivisible(int n) {
		int answer = 1;
		for(int i=2;i<=n;i++) {
			answer = lcm(answer,i);
		}
		return answer;
	}

	public static void main(String[] args) {
	   Scanner s = new Scanner(System.in);
	   int n = 10;
	   int smallestDivisible = findSmallestDivisible(n);
	   System.out.print(smallestDivisible);
	}

}
