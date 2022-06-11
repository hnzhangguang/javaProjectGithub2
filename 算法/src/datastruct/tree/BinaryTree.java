package datastruct.tree;

/**
 * <p>
 * Create By IntelliJ IDEA
 * Author��lzhpo
 * </p>
 */
public class BinaryTree {

    //���ڵ�
    TreeNode root;

    /**
     * �������Ĵ���
     */
    //��ȡ���ڵ�
    public TreeNode getRoot() {
        return root;
    }
    //���ø��ڵ�
    public void setRoot(TreeNode root) {
        this.root = root;
    }

    /**
     * �������ı���
     */
    //ǰ�����
    public void frontShow()
    {
        if(root!=null) {
            root.frontShow();
        }else
        {
            System.out.println("�˶�����Ϊ��");

        }
    }
    //�������
    public void midShow()
    {
        if(root!=null) {
            root.midShow();
        }else
        {
            System.out.println("�˶�����Ϊ��");

        }
    }
    //�������
    public void afterShow()
    {
        if(root!=null) {
            root.afterShow();
        }else
        {
            System.out.println("�˶�����Ϊ��");

        }
    }

    /**
     * �������Ĳ���
     * @param i
     * @return
     */
    //ǰ�����
    public  TreeNode frontSearch(int i) {

        return root.frontSearch(i);
    }

    /**
     * ��������ɾ��
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