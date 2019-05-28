//just the solution part

class SolutionOfLeetcode257 {
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> result = new ArrayList<>();
		if (root == null) {
			return result;
		}

		helper(root, String.valueOf(root.val), result);
		return result;
	}

	private List<String> helper(TreeNode root, String path, List<String> result) {
		if (root == null) {
			return result;
		}

		if (root.left == null && root.right == null) {
			result.add(path);
		}

		if (root.left != null) {
			helper(root.left, path + "->" + String.valueOf(root.left.val), result);
		}
		if (root.right != null) {
			helper(root.right, path + "->" + String.valueOf(root.right.val), result);
		}

		return result;
	}
}
