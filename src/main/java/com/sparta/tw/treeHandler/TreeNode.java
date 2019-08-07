package com.sparta.tw.treeHandler;


public class TreeNode {

    private TreeNode left;
    private TreeNode right;
    private final int value;

    public TreeNode(int value) {
        this.value = value;
    }


    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }



}
