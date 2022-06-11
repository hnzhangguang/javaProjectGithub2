package datastruct.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 二叉树
 */
public class TestBinaryTree {


    List<Integer> result = new ArrayList<>();
    /**
     * 简介: 前序遍历
     * 功能:
     *  作者: zhangg
     */
    public void preTraversal(TreeNode root){
        if (root == null){
            return;
        }
        result.add(root.value);
        preTraversal(root.leftNode);
        preTraversal(root.rightNode);
    }

    /**
     * 简介: 中序遍历
     * 功能:
     *  作者: zhangg
     */
    public void midTraversal(TreeNode root){
        if (root == null){
            return;
        }
        midTraversal(root.leftNode);
        result.add(root.value);
        midTraversal(root.rightNode);
    }


    /**
     * 简介: 后序遍历
     * 功能:
     *  作者: zhangg
     */
    public void postTraversal(TreeNode root){
        if (root == null){
            return;
        }
        postTraversal(root.leftNode);
        postTraversal(root.rightNode);
        result.add(root.value);
    }



    /**
     * 简介: 层次遍历
     * 功能:
     *  作者: zhangg
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null)
            return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            int count = queue.size();
            List<Integer> list = new ArrayList<Integer>();
            while(count > 0){
                TreeNode node = queue.poll();
                list.add(node.value);
                if(node.leftNode != null){
                    queue.add(node.leftNode);
                }
                if(node.rightNode != null) {
                    queue.add(node.rightNode);
                }
                count--;
            }
            res.add(list);
        }
        return res;
    }

    public static void main(String[] args) {

        /**
         * 创建二叉树
         */
        //创建一棵树
        BinaryTree binaryTree = new BinaryTree();
        //创建一个根节点
        TreeNode root = new TreeNode(1);
        //把根节点赋给树
        binaryTree.setRoot(root);
        //创建两个节点
        TreeNode rootL = new TreeNode(2);
        TreeNode rootR = new TreeNode(3);
        //把心创建的节点设置为根节点的子节点
        root.setlNode(rootL);
        root.setrNode(rootR);

        //为第二层的节点创建子节点
        rootL.setleftNode(new TreeNode(4));
        rootL.setrightNode(new TreeNode(5));
        rootR.setleftNode(new TreeNode(6));
        rootR.setrightNode(new TreeNode(7));

        /**
         * 遍历二叉树
         */
        System.out.println("======================二叉树的遍历======================");
        //1.前序遍历(根，左，右)
        System.out.println("此二叉树的前序遍历为：");
        binaryTree.frontShow();
        System.out.println();
        System.out.println("此二叉树的中序遍历为：");
        binaryTree.midShow();
        System.out.println();
        System.out.println("此二叉树的后序遍历为：");
        binaryTree.afterShow();

        /**
         * 二叉树的查找
         */
        System.out.println("======================二叉树的查找======================");
        TreeNode result = binaryTree.frontSearch(9);
        System.out.println(result);

        /**
         * 二叉树删除
         */
        System.out.println("======================二叉树的删除======================");
        binaryTree.delete(2);
        binaryTree.frontShow();
    }
}