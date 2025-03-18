package tp2_ej7;

import java.util.Queue;
import java.util.LinkedList;

import arbolBinario.BinaryTree;

public class ParcialArboles {
	private BinaryTree<Integer> tree;

	public ParcialArboles() {
		this.tree = new BinaryTree<Integer>();
	}

	public ParcialArboles(int n) {
		this.tree = new BinaryTree<Integer>(n);
	}

	public BinaryTree<Integer> getTree() {
		return this.tree;
	}

	public void setTree(BinaryTree<Integer> tree) {
		this.tree = tree;
	}

	public boolean isLeftTree(int num) {
		BinaryTree<Integer> subTree = findSubTree(tree, num);

		if (subTree == null)
			return false;

		int leftCount = singleChildCounter(subTree.getLeftChild());
		int rightCount = singleChildCounter(subTree.getRightChild());

		return (leftCount > rightCount);

	}

	public BinaryTree<Integer> findSubTree(BinaryTree<Integer> node, int num) {
		if (node == null)
			return null;
		if (node.getData() == num)
			return node;

		BinaryTree<Integer> leftResult = findSubTree(node.getLeftChild(), num);
		if (leftResult != null)
			return leftResult;

		return findSubTree(node.getRightChild(), num);
	}

	public int singleChildCounter(BinaryTree<Integer> node) {
		if (node == null)
			return (-1);

		Queue<BinaryTree<Integer>> queue = new LinkedList<>();
		queue.add(node);
		int count = 0;

		while (!queue.isEmpty()) {
			BinaryTree<Integer> current = queue.poll();

			boolean hasLeft = current.hasLeftChild();
			boolean hasRight = current.hasRightChild();

			if ((hasLeft && !hasRight) || (!hasLeft && hasRight))
				count++;

			if (hasLeft)
				queue.add(current.getLeftChild());
			if (hasRight)
				queue.add(current.getRightChild());
		}

		return count;
	}

}
