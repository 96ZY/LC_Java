//just the solution part

class SolutionofLeetCode226 {
	public TreeNode invertTree(TreeNode root) {
		if (root == null) {
			return root;
		}

		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);

		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();

			if (node.left != null) {
				queue.offer(node.left);
			}
			if (node.right != null) {
				queue.offer(node.right);
			}

			TreeNode temp;
			temp = node.left;
			node.left = node.right;
			node.right = temp;
		}

		return root;

	}
}
