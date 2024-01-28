package Training;
import java.util.Scanner;
public class SortedArrayMedian {
	
	public static int MedianOfTwoSortedArrays(int[] nums1, int[] nums2) {
		int m = nums1.length;
		int n = nums2.length;
		int[] merged = new int[m+n];
		int i=0,j=0,k=0;
		while(i<m && j < n) {
			if(nums1[i] <= nums2[j]) {
				merged[k++] = nums1[i++];
			}else {
				merged[k++] = nums2[j++];
			}
		}
		while(i<m) {
			merged[k++] = nums1[i++];
		}
		while(j<n) {
			merged[k++] = nums2[j++];
		}
		
		int size = merged.length;
		if(size%2 == 1) {
			return merged[size/2];
		}else {
			int median1 = merged[size/2];
			int median2 = merged[(size-1)/2];
			return (median1 + median2)/2;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] nums1 = {1,2,3,4,5,6,7};
		int[] nums2 = {8,9,10,11,12,13};
		int median = MedianOfTwoSortedArrays(nums1, nums2);
		System.out.println(median);
	}
}
