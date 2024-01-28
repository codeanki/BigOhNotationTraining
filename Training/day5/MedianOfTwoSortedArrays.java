package Training;

import java.util.Scanner;

public class MedianOfTwoSortedArrays {

	public static int Median(int[] nums1, int[] nums2, int m, int n) {
		int[] merged = new int[m + n];
		int i = 0, j = 0, k = 0;
		while (i <= m && j <= n) {
			if (nums1[i] <= nums2[j]) {
				merged[k++] = nums1[i++];
			} else {
				merged[k++] = nums2[j++];
			}
		}
		while (i < m) {
			merged[k++] = nums1[i++];
		}
		while (j < n) {
			merged[k++] = nums2[j++];
		}
		int size = merged.length;
		if (size % 2 == 1) { // In case of odd length
			return merged[size / 2];
		} else { // In case of even length
			int mid1 = merged[size / 2];
			int mid2 = merged[(size - 1) / 2];
			return (mid1 + mid2) / 2;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] nums1 = { 1, 3, 4, 6, 8, 10 };
		int[] nums2 = { 2, 5, 8, 12, 14, 17, 18 };
		int m = nums1.length;
		int n = nums2.length;
		int median = Median(nums1, nums2, m, n);
		System.out.println(median);
	}
}
