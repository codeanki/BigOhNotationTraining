package Training;

import java.util.Arrays;
import java.util.*;
import java.util.ArrayList;
public class TripletSumEqualsTargetOptimisedCode {
	
	public static void SortArray(int[]nums) {
		int n = nums.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(nums[j] > nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
	}
	public static List<List<Integer>> TripletSum(int[] nums,int target_sum){
		List<List<Integer>> triplet = new ArrayList<>();
		SortArray(nums);
		
		for(int i=0;i<nums.length-2;i++) {		
			if(i==0 || (i>0 && nums[i] != nums[i-1])) {
				int left = i+1;
				int right = nums.length - 1;
				int target = target_sum - nums[i];
				while(left<right) {
					int currentsum = nums[left] + nums[right];
					if(currentsum == target) {
						triplet.add(Arrays.asList(nums[i], nums[left], nums[right]));
						while(left<right && nums[left]==nums[left+1]) {
							left++;
						}
						while(left<right && nums[right]==nums[right-1]) {
							right--;
						}
						left++;
						right--;
					}else if(currentsum < target) {
						left++;
					}else {
						right--;
					}
				}
			}
		}
		return triplet;
	}

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7,8,9};
		int target_sum = 15;
		List<List<Integer>> triplet = TripletSum(nums, target_sum);
		System.out.print(triplet);
	}

}
