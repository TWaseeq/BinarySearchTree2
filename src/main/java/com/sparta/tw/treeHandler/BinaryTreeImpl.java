package com.sparta.tw.treeHandler;

import com.sparta.tw.ChildNotFoundException;

public class BinaryTreeImpl implements BinaryTree {

    private final TreeNode root;
    private int treeNodeCount = 1;
    private TreeNode currentNode;
    private int[] sortedArray;
    private int arrayCount;


    public BinaryTreeImpl(int element) {
        root = new TreeNode(element);
    }

    public BinaryTreeImpl(int[] arrayOfElements) {
        root = new TreeNode(arrayOfElements[0]); //SETS THE FIRST VALUE OF ARRAY TO ROOT **POTENTIALLY CHANGE TO LOWEST VALUE IN ARRAY**

        for (int i = 1; i < arrayOfElements.length; i++) {
            addElement(arrayOfElements[i]);
        }
    }

    @Override
    public int getRootElement() {
        return root.getValue();
    }

    @Override
    public int getNumberOfElements() {
        return treeNodeCount;
    }

    @Override
    public void addElement(int element) {
        if (currentNode == null) {
            currentNode = root;
        }
        if (element > currentNode.getValue()) { //HIGHER THAN = PLACE RIGHT
            if (currentNode.getRight() == null) {
                currentNode.setRight(new TreeNode(element));
                treeNodeCount++;
            } else {
                currentNode = currentNode.getRight();
                addElement(element);
            }
        } else if (element < currentNode.getValue()) { //LOWER THAN = PLACE LEFT
            if (currentNode.getLeft() == null) {
                currentNode.setLeft(new TreeNode(element));
                treeNodeCount++;
            } else {
                currentNode = currentNode.getLeft();
                addElement(element);
            }
        }
    }

    @Override
    public void addElements(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            addElement(elements[i]);
        }
    }

    @Override
    public int findElement(int value) {
        findElementHelper(root, value);
        return currentNode.getValue();
    }

    public void findElementHelper(TreeNode current, int value) {

        if (current.getValue() == value) {
            currentNode = current;
        }

        if (current.getValue() < value) {
            if (current.getRight() != null) {
                findElementHelper(current.getRight(), value);
            }
        }
        if (current.getValue() > value) {
            if (current.getLeft() != null) {
                findElementHelper(current.getLeft(), value);
            }
        }
    }


    @Override
    public int getLeftChild(int element) throws ChildNotFoundException {
         findElementHelper(root, element);
        return currentNode.getLeft().getValue();
    }

    @Override
    public int getRightChild(int element) {
         findElementHelper(root, element);
        return currentNode.getRight().getValue();

    }

    @Override
    public int[] getSortedTreeAsc() {
        ascTreeHelper(root);
    return sortedArray;
    }

    public void ascTreeHelper(TreeNode start){
        sortedArray = new int[getNumberOfElements()];
        if(start != null){
            ascTreeHelper(start.getLeft());
            ascTreeHelper(start.getRight());
        }
    }

    @Override
    public int[] getSortedTreeDesc() {
        descTreeHelper(root);
        return sortedArray;
    }

    public void descTreeHelper(TreeNode start){
        sortedArray = new int[getNumberOfElements()];
        if(start != null){
            descTreeHelper(start.getRight());
            descTreeHelper(start.getLeft());
        }
    }
}
