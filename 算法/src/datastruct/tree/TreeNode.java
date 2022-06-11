package datastruct.tree;

/**
 * 二叉树
 *
 * <p>
 * Create By IntelliJ IDEA
 * Author：lzhpo
 * </p>
 */
public class TreeNode {

    //节点的权
    int value;
    //左儿子
    TreeNode leftNode;
    //右儿子
    TreeNode rightNode;

    /**
     * 二叉树的创建
     */
    //构造方法，传入一个值
    public TreeNode(int value) {
        this.value = value;
    }

    //设置左儿子
    public void setlNode(TreeNode lNode) {
        this.leftNode = lNode;
    }

    //设置右儿子
    public void setrNode(TreeNode rNode) {
        this.rightNode = rNode;
    }


    /**
     * 二叉树的遍历
     */
    //前序遍历(根，左，右)
    public void frontShow() {
        //先遍历当前节点(根节点);
        System.out.print(value);
        //左节点
        if(leftNode!=null)
        {
            leftNode.frontShow();
        }
        //右节点
        if(rightNode!=null)
        {
            rightNode.frontShow();
        }

    }
    //中序遍历(左，根，右)
    public void midShow() {
        //先遍历左节点
        if(leftNode!=null)
        {
            leftNode.midShow();
        }
        //在遍历当前节点(根节点);
        System.out.print(value);
        //最后右节点
        if(rightNode!=null)
        {
            rightNode.midShow();
        }

    }
    //后序遍历(左，右，根)
    public void afterShow() {
        //先左节点
        if(leftNode!=null)
        {
            leftNode.afterShow();
        }
        //在右节点
        if(rightNode!=null)
        {
            rightNode.afterShow();
        }
        //最后遍历当前节点(根节点);
        System.out.print(value);
    }

    //设置左孩子
    public void setleftNode(TreeNode lNode) {
        this.leftNode = lNode;
    }
    //设置右孩子
    public void setrightNode(TreeNode rNode) {
        this.rightNode = rNode;
    }

    /**
     * 二叉树的查找
     */
    //前序查找
    public TreeNode frontSearch(int i) {

        TreeNode target=null;
        //对比当前节点的值
        if(this.value==i)
        {
            return this;
            //当前节点中的值不是要查找的
        }else {
            //查找左节点
            if(leftNode!=null)
            {
                //有可能可以查到，有可能查找不到，查不到的话，target还是null
                target=leftNode.frontSearch(i);
            }
            //如果不为空，则查找成功
            if(target!=null) {
                return target;
            }
            //查找右节点
            if(rightNode!=null)
            {
                target=rightNode.frontSearch(i);
            }
        }
        return target;

    }

    /**
     * 二叉树的删除
     */
    //删除二叉树的子树
    public void delete(int i) {
        TreeNode parent=this;
        //判断左孩子
        if(parent.leftNode!=null&&parent.leftNode.value==i)
        {
            parent.leftNode=null;
            return;
        }
        //判断右孩子
        if(parent.rightNode!=null&&parent.rightNode.value==i)
        {
            parent.rightNode=null;
            return;
        }
        //如果都不是,递归检查并删除左孩子
        parent=leftNode;
        if(parent!=null)
        {
            parent.delete(i);
        }
        //递归检查并删除右孩子
        parent=rightNode;
        if(parent!=null)
        {
            parent.delete(i);
        }

    }

}