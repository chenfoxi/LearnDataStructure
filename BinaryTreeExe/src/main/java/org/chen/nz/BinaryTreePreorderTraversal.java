package org.chen.nz;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by foxi.chen on 28/09/20.
 *
 * @author foxi.chen
 */
public class BinaryTreePreorderTraversal {

    public static void main(String[] args) {

    }

//    Given the root of a binary tree, return the preorder traversal of its nodes' values.
//    Constraints:
//
//    The number of nodes in the tree is in the range [0, 100].
//        -100 <= Node.val <= 100

    static List<Integer> traverseByIteration(TreeNode root){
        // iteratively version using stack
        List<Integer> result = new ArrayList<>();
        if(root == null) {
            return new ArrayList<>();
        }
        Stack<TreeNode> nodeStack = new Stack<>();
        nodeStack.push(root);
        while(!nodeStack.empty()){
            TreeNode temp = nodeStack.pop();
            result.add(temp.val);
            if(temp.right != null) {
                nodeStack.push(temp.right);
            }
            if(temp.left != null) {
                nodeStack.push(temp.left);
            }
        }
        return result;
    }
}
