package cn.yan.leet_116;

import java.util.Scanner;

public class Solution {
    public static Scanner  sc = new Scanner(System.in);

    public static Node connect(Node root) {
        return null;
    }

    public static void createTree(Node root)
    {

        int val = sc.nextInt();
        if (val==-1) {
            return;
        }else if (root==null && val != -1 ) {
            root = new Node(val);
        }else {
            Node son = new Node(val);
            createTree(son.left);
            createTree(son.right);
        }
    }

    public static void disPlay(Node root)
    {
        if (root==null) return ;
        System.out.println(root.val);
        if (root.left!=null)  disPlay(root.left);
        if (root.right!=null) disPlay(root.right);
    }

    public static void main(String[] args) {
            Node  root= null;
            createTree(root);
            disPlay(root);


    }
}
