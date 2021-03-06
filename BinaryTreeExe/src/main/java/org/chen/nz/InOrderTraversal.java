package org.chen.nz;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraversal {
  public void main(String[] args){
  }
  static List<Integer> inorderTraversalIteration(TreeNode root) {
        // iteration version in-order traversal
        List<Integer> result = new ArrayList<>();
        if(root == null) {
            return result;
        }
        Stack<TreeNode> nodeStacks = new Stack<>();
        while(!nodeStacks.empty() || root != null) {
            if(root != null) {
            // go through the left part
                nodeStacks.push(root);
                root = root.left;
            } else {
                root = nodeStacks.pop();
                result.add(root.val);
                root = root.right;

            }
        }
        return result;
    }
}
