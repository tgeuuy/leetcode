package cn.yan.leet_129;

import cn.structurel.TreeNode;
import cn.util.TreeUtil;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Solution {


    public int dfs(TreeNode root, int presum) {
        if (root == null) return 0;

        int sum = presum * 10 + root.val;
        if (root.right == null && root.left == null) return sum;
        else return dfs(root.left, sum) + dfs(root.right, sum);
    }

    public int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    @Test
    public void practice() {
        Integer[] arr = {4, 9, 0, 5, 1};
        TreeNode root = TreeUtil.createTree(arr);
        int res = sumNumbers(root);
        System.out.println("res=" + res);
        //TreeUtil.display(root);
    }
}
