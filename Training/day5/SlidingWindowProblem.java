package Training;
import java.util.Scanner;
public class SlidingWindowProblem {
	
	public static void findKmaxElementInArray(int[] nums, int k) {
		int n = nums.length;
		int maxElement = 0;
		for(int i =0; i<=n-k;i++) {
			maxElement = nums[i];
			for(int j=1;j<k;j++) {
				if(nums[i+j] > maxElement) {
					maxElement = nums[i+j];
				}
			}
			System.out.print(maxElement);
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] nums = {1,2,3,1,4,5,2,3,6};
		int k=3;
		findKmaxElementInArray(nums,k);
	}
}
