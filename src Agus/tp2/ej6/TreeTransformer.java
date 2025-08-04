package tp2.ej6;

// TODO CHATGPT
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
    }
}

public class TreeTransformer {

    public static TreeNode transformTree(TreeNode root) {
        return buildTransformedTree(root).newNode;
    }

    // Clase auxiliar para retornar el nuevo nodo y la suma total del subárbol original
    private static class Result {
        TreeNode newNode;
        int totalSubtreeSum;

        Result(TreeNode newNode, int totalSubtreeSum) {
            this.newNode = newNode;
            this.totalSubtreeSum = totalSubtreeSum;
        }
    }

    private static Result buildTransformedTree(TreeNode originalNode) {
        if (originalNode == null) {
            return new Result(null, 0);
        }

        Result leftResult = buildTransformedTree(originalNode.left);
        Result rightResult = buildTransformedTree(originalNode.right);

        int subtreesSum = leftResult.totalSubtreeSum + rightResult.totalSubtreeSum;

        TreeNode newNode = new TreeNode(subtreesSum); // nuevo nodo con suma de subárboles

        newNode.left = leftResult.newNode;
        newNode.right = rightResult.newNode;

        int totalSum = originalNode.val + subtreesSum;

        return new Result(newNode, totalSum);
    }
}
