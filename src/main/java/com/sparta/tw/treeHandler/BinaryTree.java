package com.sparta.tw.treeHandler;

import com.sparta.tw.ChildNotFoundException;

/**
 * Created by keith.dauris on 26/06/2017.
 */
public interface BinaryTree {
    int getRootElement();

    int getNumberOfElements();

    void addElement(int element);

    void addElements(int[] elements);

    int findElement(int value);

    int getLeftChild(int element) throws ChildNotFoundException;

    int getRightChild(int element);

    int[] getSortedTreeAsc();

    int[] getSortedTreeDesc();
}