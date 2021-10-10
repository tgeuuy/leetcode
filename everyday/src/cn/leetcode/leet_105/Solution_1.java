package cn.leetcode.leet_105;

import cn.structurel.TreeNode;
import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Solution_1 {

    /**
     * 前序遍历 preorder = [3,9,20,15,7]
     * 中序遍历 inorder = [9,3,15,20,7]
     */


    public HashMap<Integer, Integer> map = new HashMap<>();


    @Test
    public void test() {
        int[] preorder = new int[]{3, 9, 20, 15, 7};
        int[] inorder = new int[]{9, 3, 15, 20, 7};
        TreeNode root = buildTree(preorder, inorder);
        cenxu(root);

    }


    private TreeNode buildTree(int[] preorder, int[] inorder) {

        int n = preorder.length;
        for (int i = 0; i < n; i++) {
            map.put(inorder[i], i);
        }

        return insert(preorder, 0, n - 1, inorder, 0, n - 1);
    }

    private TreeNode insert(int[] preorder, int pl, int pr, int[] inorder, int il, int ir) {
        if (pl > pr) return null;

        int root_p = pl;   //前序节点根节点的位置
        int root_i = map.get(preorder[root_p]);  //中序节点根节点的位置
        TreeNode root = new TreeNode(preorder[pl]);

        int left_size = root_i - il;

        root.left = insert(preorder, pl + 1, pl + left_size, inorder, il, root_i - 1);
        root.right = insert(preorder, pl + left_size + 1, pr, inorder, root_i+1, ir);

        return root;


    }


    private void cenxu(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.val + " ");
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }
    }


}
