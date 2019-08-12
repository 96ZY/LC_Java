//Just the Solution part
package com.leetcode.huang;
import java.util.*;;

public class SolutionOfLeetcode658 {
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] arr = new int[]{1, 2, 3, 4, 5};
		int k = 4;
		int x = -1;
		List<Integer> list = s.findClosestElements(arr, k, x);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        if (arr == null || k < 0) {
            return null;
        }
        if (arr.length == 0 || k == 0) {
            return new ArrayList<>();
        }
        
        int left = 0;
        int right = arr.length - 1;
        List<Integer> answer = new ArrayList<>();
        Deque<Integer> stackForMidLeft = new LinkedList<>();
        Deque<Integer> queueForMidRight = new LinkedList<>();
        while (left < right - 1) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                stackForMidLeft.push(arr[mid]);
                k--;
                left = mid - 1;
                right = mid + 1;
                if (k < 0) {
                    answer.add(arr[mid]);
                    return answer;
                }
                break;
            } else if (arr[mid] > x) {
                right = mid;
            } else {
                left = mid;
            }
        }
        
        while (left >= 0 && right <= arr.length - 1 && k > 0) {
            if (Math.abs(arr[left] - x) <= Math.abs(arr[right] - x)) {
                stackForMidLeft.push(arr[left]);
                left--;
                k--;
            } else {
                queueForMidRight.offer(arr[right]);
                right++;
                k--;
            }          
        }
        
        if (k > 0) {
            while (k > 0 && left >= 0) {
                stackForMidLeft.push(arr[left]);
                left--;
                k--;
            }
            while (k > 0 && right <= arr.length - 1) {
                queueForMidRight.offer(arr[right]);
                right++;
                k--;
            }
        }
        
        while (!stackForMidLeft.isEmpty()) {
            answer.add(stackForMidLeft.pop());
        }
        while (!queueForMidRight.isEmpty()) {
            answer.add(queueForMidRight.poll());
        }
        
        return answer;
        
    }
}
