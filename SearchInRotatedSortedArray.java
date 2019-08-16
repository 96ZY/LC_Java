//Just the solution part;
//When openning this java file in IDE, you need to rename the class or the file-name;

public class SolutionOfLeetcode33 {
	public static void main(String[] args) {
		Solution33 s = new Solution33();
		int[] nums = new int[] { 1, 3 };
		int target = 3;
		System.out.println(s.search(nums, target));
	}
}

//Use binary search;
//Time complexity = O(log n);

class Solution33 {
	public int search(int[] nums, int target) {
		if (nums == null || nums.length == 0) {
			return -1;
		}

		int pivot = findPivot(nums);
		// System.out.println("pivot = " + pivot);

		if (pivot == 0) { // If the pivot is 0, it means that the array is not rotated. We just need classical binary search;
			return binarySearch(nums, 0, nums.length - 1, target);
		}

		if (target >= nums[0]) { // The target is at the left ascending array;
			return binarySearch(nums, 0, pivot, target);
		} else { // The target is at the right ascending array;
			return binarySearch(nums, pivot, nums.length - 1, target);
		}

	}

	private int findPivot(int[] nums) {
		int left = 0;
		int right = nums.length - 1;

		while (left < right - 1) { // The while loop will stop when left is next to right;
			int mid = left + (right - left) / 2;
			if (nums[mid] < nums[mid - 1] && nums[mid] < nums[mid + 1]) { // Bingo!
				return mid;
			} else if (nums[mid] >= nums[0]) { // The mid is at the left ascending array;
				left = mid;
			} else { // The mid is at the right ascending array;
				right = mid;
			}
		}

		// After the while loop, the left is next to the right, and if the pivot exists, the nums[left] must be larger;
		// Post-processing;
		if (nums[left] > nums[right]) {
			return right;
		} else { // No pivot exists!
			return 0;
		}
	}

	private int binarySearch(int[] nums, int left, int right, int target) {
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] == target) { // Bingo!
				return mid;
			} else if (nums[mid] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}

		return -1;
	}

}
