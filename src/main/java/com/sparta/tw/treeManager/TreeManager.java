package com.sparta.tw.treeManager;

import com.sparta.tw.treeHandler.BinaryTree;
import com.sparta.tw.treeHandler.BinaryTreeImpl;

public class TreeManager {

    public void createBinaryTree(){
        BinaryTreeImpl binaryTree = new BinaryTreeImpl(new int[]{15, 7, 62, 35, 87, 31, 20,25,32,10});
        BinaryTreeImpl binaryTree2 = new BinaryTreeImpl(new int[]{2, 7, 11, 20, 25, 31, 36, 40, 46, 50});
        binaryTree2.getSortedTreeDesc();
        binaryTree2.getSortedTreeAsc();
//        binaryTree.addElement(12);
//        binaryTree.addElement(4);
//        binaryTree.addElement(9);
//        binaryTree.addElement(7);
//        System.out.println("BINARY TREE 1 # = "+ binaryTree.getNumberOfElements());
//
//        binaryTree2.findElement(15);
//        binaryTree2.findElement(20);
//        binaryTree2.findElement(30);
//        System.out.println("BINARY TREE 2 # = "+ binaryTree.getNumberOfElements());

    }
}
