//Just the solution part;
//When openning this java file in IDE, you need to change the class name or the file name. Ohterwise, error would occur!

public class SolutionOfLeetcode153 {
	public static void main(String[] args) {
		Solution153 s = new Solution153();

		int[] nums = null;
		System.out.println(s.findMin(nums));

		nums = new int[] {};
		System.out.println(s.findMin(nums));
		
		nums = new int[] {1, 2, 3, 4};
		System.out.println(s.findMin(nums));
		
		nums = new int[] {4, 1, 2, 3};
		System.out.println(s.findMin(nums));
		
		nums = new int[] {3, 4, 1, 2};
		System.out.println(s.findMin(nums));

		nums = new int[] {2, 3, 4, 1};
		System.out.println(s.findMin(nums));
	}
}

//Use binary search;
//Time Complexity = O(log n);
//Space Complexity = O(1);
class Solution153 {
	public int findMin(int[] nums) {
		if (nums == null || nums.length <= 0) {
			return -1;
		}

		int left = 0;
		int right = nums.length - 1;

    //stop when left is beside right;
		while (left < right - 1) {
			int mid = left + (right - left) / 2;
			if (nums[mid] < nums[mid - 1] && nums[mid] < nums[mid + 1]) { //Bingo!
				return nums[mid];
			} else if (nums[mid] >= nums[0]) { //The nums[mid] is in the left ascending array;
				left = mid;
			} else { //The nums[mid] is in the right ascending array;
				right = mid;
			}
		}

    //Post-processing
		if (nums[left] > nums[right]) { //nums[right] is the pivot we are looking for;
			return nums[right];
		} else { //In this case, it is sure that there exit no such pivot;
			return nums[0];
		}

	}
}
