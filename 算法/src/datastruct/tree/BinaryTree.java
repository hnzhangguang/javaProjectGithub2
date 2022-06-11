package datastruct.tree;

/**
 * <p>
 * Create By IntelliJ IDEA
 * Author：lzhpo
 * </p>
 */
public class BinaryTree {

    //根节点
    TreeNode root;

    /**
     * 二叉树的创建
     */
    //获取根节点
    public TreeNode getRoot() {
        return root;
    }
    //设置根节点
    public void setRoot(TreeNode root) {
        this.root = root;
    }

    /**
     * 二叉树的遍历
     */
    //前序遍历
    public void frontShow()
    {
        if(root!=null) {
            root.frontShow();
        }else
        {
            System.out.println("此二叉树为空");

        }
    }
    //中序遍历
    public void midShow()
    {
        if(root!=null) {
            root.midShow();
        }else
        {
            System.out.println("此二叉树为空");

        }
    }
    //后序遍历
    public void afterShow()
    {
        if(root!=null) {
            root.afterShow();
        }else
        {
            System.out.println("此二叉树为空");

        }
    }

    /**
     * 二叉树的查找
     * @param i
     * @return
     */
    //前序查找
    public  TreeNode frontSearch(int i) {

        return root.frontSearch(i);
    }

    /**
     * 二叉树的删除
     * @param i
     */
    public void delete(int i) {
        if(root.value==i)
        {
            root=null;
        }else {
            root.delete(i);
        }

    }

}