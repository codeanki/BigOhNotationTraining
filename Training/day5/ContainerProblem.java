package Training;
import java.util.Scanner;
public class ContainerProblem {
	
	public static int maximum(int a, int b) {
		int max;
		if(a > b) {
			max = a;
		}else {
			max = b;
		}
		return max;
	}
	
	public static int minimum(int a,int b) {
		int min;
		if(a < b) {
			min = a;
		}else {
			min = b;
		}
		return min;
	}
	
	public static int ContainerWithMaxWater(int[] height) {
		int left = 0;
		int right = height.length - 1;
		int waterContained = 0;
		while(left < right) {
			int h = minimum(height[left], height[right]);
			waterContained = maximum(waterContained, (right - left) * h);
			if(height[left] < height[right]) {
				left++;
			}else {
				right--;
			}
		}
		return waterContained;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] height = {1,8,6,2,5,4,8,3,7};
		System.out.println(ContainerWithMaxWater(height));
	}
}
