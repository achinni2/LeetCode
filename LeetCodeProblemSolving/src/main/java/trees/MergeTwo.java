package trees;

/**
 * Given two binary trees and imagine that when you put one of them to cover the other,
 * some nodes of the two trees are overlapped while the others are not.
 * You need to merge them into a new binary tree. The merge rule is that if two nodes overlap,
 * then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used
 * as the node of new tree.
 */
public class MergeTwo {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null)
            return null;
        TreeNode result = new TreeNode(merge(t1,t2));
        result.left = mergeTrees(t1 == null? null : t1.left, t2 == null ? null : t2.left);
        result.right = mergeTrees(t1 == null? null : t1.right, t2 == null ? null : t2.right);
        return result;
    }

    public int merge(TreeNode t1, TreeNode t2)
    {
        int val = (t1 == null ? 0 : t1.val) + (t2 == null ? 0 : t2.val);
        return val;
    }
}
