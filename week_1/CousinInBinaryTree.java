/*
In a binary tree, the root node is at depth 0, and children of each depth k node are at depth k+1.

Two nodes of a binary tree are cousins if they have the same depth, but have different parents.

We are given the root of a binary tree with unique values, and the values x and y of two different nodes in the tree.

Return true if and only if the nodes corresponding to the values x and y are cousins.
 */
   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
    this.left = left;
    this.right = right;
 }
  }
public class CousinInBinaryTree {

    Node xNode = new Node();
    Node yNode = new Node();
    int x, y;

    public boolean isCousins(TreeNode root, int x, int y) {
        this.x = x;
        this.y = y;
        preOrder(root, 0, 1);
        return xNode.parent != yNode.parent && xNode.depth == yNode.depth;
    }

    private void preOrder(TreeNode root, int parent, int depth) {
        if (root == null) {
            return;
        }

        if (root.val == x) {
            xNode.parent = parent;
            xNode.depth = depth;
        }
        if (root.val == y) {
            yNode.parent = parent;
            yNode.depth = depth;
        }
        preOrder(root.left, root.val, depth + 1);
        preOrder(root.right, root.val, depth + 1);
    }

    class Node {
        int parent;
        int depth;
    }
}
