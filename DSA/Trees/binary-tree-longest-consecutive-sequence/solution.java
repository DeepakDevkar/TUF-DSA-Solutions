class Solution 
{
    public int longestConsecutive(TreeNode root) 
    {
        return search(root, null, 0);
    }

    private int search(TreeNode root, TreeNode parent, int len) 
    {
        
        if (root == null) 
        return len; 
        
        len = (parent != null && root.val == parent.val + 1) ? len + 1 : 1; 
        return Math.max(len, Math.max(search(root.left, root, len), search(root.right, root, len)));
    }
}