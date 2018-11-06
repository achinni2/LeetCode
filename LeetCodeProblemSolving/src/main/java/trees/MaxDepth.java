package trees;

/**
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path from the root node down to
 *  the farthest leaf node.
 */
public class MaxDepth {
    int max = 0;
    public int maxDepth(TreeNode root) {
        if(root == null)
            return max;
        getDepth(root,1);
        return max;
    }
    public int getDepth(TreeNode root, int depth)
    {
        if(root == null)
        {
            return depth;
        }
        if(depth > max)
        {
            max = depth;
        }
        int left = 0;
        int right = 0;
        if(root.left != null)
        {
            left = getDepth(root.left, depth+1);
        }
        if(root.right != null)
        {
            right = getDepth(root.right,depth+1);
        }
        return (left >= right)?left:right;
    }
}
