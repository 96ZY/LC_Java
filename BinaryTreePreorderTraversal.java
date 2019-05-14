//just the solution part
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<>();
		preTraversal(root, result);
		return result;
	}

	public List<Integer> preTraversal(TreeNode root, List<Integer> list) {
		if (root == null) {
			return list;
		}
		list.add(root.val);
		preTraversal(root.left, list);
		preTraversal(root.right, list);
		return list;
	}
}
