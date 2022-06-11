package datastruct.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * ������
 */
public class TestBinaryTree {


    List<Integer> result = new ArrayList<>();
    /**
     * ���: ǰ�����
     * ����:
     *  ����: zhangg
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
     * ���: �������
     * ����:
     *  ����: zhangg
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
     * ���: �������
     * ����:
     *  ����: zhangg
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
     * ���: ��α���
     * ����:
     *  ����: zhangg
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
         * ����������
         */
        //����һ����
        BinaryTree binaryTree = new BinaryTree();
        //����һ�����ڵ�
        TreeNode root = new TreeNode(1);
        //�Ѹ��ڵ㸳����
        binaryTree.setRoot(root);
        //���������ڵ�
        TreeNode rootL = new TreeNode(2);
        TreeNode rootR = new TreeNode(3);
        //���Ĵ����Ľڵ�����Ϊ���ڵ���ӽڵ�
        root.setlNode(rootL);
        root.setrNode(rootR);

        //Ϊ�ڶ���Ľڵ㴴���ӽڵ�
        rootL.setleftNode(new TreeNode(4));
        rootL.setrightNode(new TreeNode(5));
        rootR.setleftNode(new TreeNode(6));
        rootR.setrightNode(new TreeNode(7));

        /**
         * ����������
         */
        System.out.println("======================�������ı���======================");
        //1.ǰ�����(��������)
        System.out.println("�˶�������ǰ�����Ϊ��");
        binaryTree.frontShow();
        System.out.println();
        System.out.println("�˶��������������Ϊ��");
        binaryTree.midShow();
        System.out.println();
        System.out.println("�˶������ĺ������Ϊ��");
        binaryTree.afterShow();

        /**
         * �������Ĳ���
         */
        System.out.println("======================�������Ĳ���======================");
        TreeNode result = binaryTree.frontSearch(9);
        System.out.println(result);

        /**
         * ������ɾ��
         */
        System.out.println("======================��������ɾ��======================");
        binaryTree.delete(2);
        binaryTree.frontShow();
    }
}