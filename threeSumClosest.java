import java.util.Arrays;

class solutionofthreesumclosest {
	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int len = nums.length;
		if (len < 3) {
			return 0;
		} else if (len == 3) {
			return nums[0] + nums[1] + nums[2];
		} else {
			int firstsum = nums[0] + nums[1] + nums[2];
			int firstdelta = Math.abs(firstsum - target);
			for (int a = 0; a < len - 2; a++) {
				int b = a + 1;
				int c = len - 1;
				while (b < c) {
					int secondsum = nums[a] + nums[b] + nums[c];
					int seconddelta = Math.abs(secondsum - target);
					if (seconddelta < firstdelta) {
						firstdelta = seconddelta;
						firstsum = secondsum;
					}
					if (secondsum > target) {
						c--;
					}
					if (secondsum < target) {
						b++;
					} else if (secondsum == target) {
						System.out.println(secondsum);
						return secondsum;
					}
				}
			}
			System.out.println("f:" + firstsum);
			return firstsum;
		}
	}
}

public class threeSumClosest extends solutionofthreesumclosest {
	public static void main(String[] args) {
		threeSumClosest t = new threeSumClosest();
		int nums[] = new int[] { -1, 2, 1, -4 };
		int target = 1;
		t.threeSumClosest(nums, target);
	}
}
