
/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;

public class MyMain {
    public static void main(String[] args) {

        MyBinarySearchTree mst = new MyBinarySearchTree();

        TreeNode root;

        root = new TreeNode(10);

        mst.insert(root, 6);

        mst.insert(root, 45);

        mst.insert(root, 40);

        mst.insert(root, 25);

        mst.insert(root, 30);

        mst.insert(root, 12);

        mst.insert(root, 7);

        mst.insert(root, 9);

        mst.insert(root, 15);

        mst.insert(root, 1);

        mst.insert(root, 5);


    }
}