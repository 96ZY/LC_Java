//just the solution part
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class SolutionofLeetCode103 {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();

		if (root == null) {
			return result;
		}

		Stack<TreeNode> currentLevel = new Stack<TreeNode>();
		Stack<TreeNode> nextLevel = new Stack<TreeNode>();
		Stack<TreeNode> temp;

		boolean isNormalOrder = true;
		currentLevel.push(root);

		while (!currentLevel.isEmpty()) {
			List<Integer> currentLevelResult = new ArrayList<Integer>(); // use currentLevelResult to store the right
																			// order

			while (!currentLevel.isEmpty()) { // pop all the node of the currentLevel
				TreeNode node = currentLevel.pop(); // pop one node, we can call it nodeI
				currentLevelResult.add(node.val); // store the nodeI's val;

				if (isNormalOrder) { // if true, use stack (first in, last out) to store nodeI's children from left
										// to right
					if (node.left != null) {
						nextLevel.push(node.left);
					}
					if (node.right != null) {
						nextLevel.push(node.right);
					}
				} else {
					if (node.right != null) {
						nextLevel.push(node.right);
					}
					if (node.left != null) {
						nextLevel.push(node.left);
					}
				}
			}

			result.add(currentLevelResult); // after the inner "while" above, currentLevel is empty
			temp = currentLevel;
			currentLevel = nextLevel; // currentLevel will be nextLevel so that the exterior "while" can still iterate
			nextLevel = temp; // nextLevel is empty;
			isNormalOrder = !isNormalOrder;

		}

		return result;
	}
}
