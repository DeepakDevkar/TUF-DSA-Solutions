class BSTIterator {

    ArrayList<Integer> list = new ArrayList<>();
    int index = -1;

    public BSTIterator(TreeNode root) {
        inorder(root);
    }

    void inorder(TreeNode root) {
        if (root == null)
            return;

        inorder(root.left);
        list.add(root.data);
        inorder(root.right);
    }

    public boolean hasNext() {
        return index + 1 < list.size();
    }

    public int next() {
        index++;
        return list.get(index);
    }

    public boolean hasPrev() {
        return index > 0;
    }

    public int prev() {
        index--;
        return list.get(index);
    }
}