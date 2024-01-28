package Training;
import java.util.Scanner;
public class TripletSumEqualsToTarget {
	
	public static int[][] TripletSum(int[] nums, int target_sum){
		int n = nums.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=j+1;k<n;k++) {
					if(nums[i]+nums[j]+nums[k] == target_sum) {
						return new int[][] {{nums[i],nums[j],nums[k]}};
					}
				}
			}
		}
		return new int[][] {{-1,-1,-1}};
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] nums = {1,2,3,4,5,6,7,8,9};
		int target_sum = 6;
		int[][] result = TripletSum(nums,target_sum);
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result[i].length;j++) {
				System.out.print(result[i][j] + " ");
			}
		}
	}
}
