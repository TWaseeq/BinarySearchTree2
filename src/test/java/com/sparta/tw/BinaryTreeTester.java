package com.sparta.tw;

import com.sparta.tw.treeHandler.BinaryTree;
import com.sparta.tw.treeHandler.BinaryTreeImpl;
import com.sparta.tw.treeHandler.TreeNode;
import com.sparta.tw.treeManager.TreeManager;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeTester
{
    TreeManager treeManager = new TreeManager();

    @Test
    public void getRootElement() {
        BinaryTreeImpl binaryTree = new BinaryTreeImpl(10);

        Assert.assertNotNull(binaryTree.getRootElement());
    }

    @Test
    public void getRootElementArrayConstructor(){
        BinaryTreeImpl binaryTree = new BinaryTreeImpl(new int[] {2,7,8,10,15,10});

        assertTrue(binaryTree.getRootElement() == 2);
    }

    @Test
    public void checkAddElement(){
        BinaryTree binaryTree = new BinaryTreeImpl(10);
        binaryTree.addElement(20);

        assertEquals(20, binaryTree.findElement(20));

    }

    @Test
    public void checkFindElement(){
        BinaryTreeImpl binaryTree = new BinaryTreeImpl(new int[] {2,7,8,10,15,10});
        Assert.assertEquals(binaryTree.findElement(8), 8);
    }

    @Test
    public void checkTotalNodes(){
        int[] array = new int[]{2,5,1,6,4,3};
        BinaryTree binaryTree3 = new BinaryTreeImpl(array);

        System.out.println(binaryTree3.getNumberOfElements());
        assertTrue(binaryTree3.getNumberOfElements() == array.length);
    }

    @Test
    public void checkRightNodeValue(){
        BinaryTree binaryTree = new BinaryTreeImpl(new int[]{2,5,1});

        assertEquals(5, binaryTree.getRightChild(2));
    }

    @Test
    public void checkLeftNodeValue() throws ChildNotFoundException{
        BinaryTree binaryTree = new BinaryTreeImpl(new int[]{2,5,1});

        assertEquals(1, binaryTree.getLeftChild(2));
    }

    public void checkAscTree(){

    }
}

