package datastruct.tree;

/**
 * ������
 *
 * <p>
 * Create By IntelliJ IDEA
 * Author��lzhpo
 * </p>
 */
public class TreeNode {

    //�ڵ��Ȩ
    int value;
    //�����
    TreeNode leftNode;
    //�Ҷ���
    TreeNode rightNode;

    /**
     * �������Ĵ���
     */
    //���췽��������һ��ֵ
    public TreeNode(int value) {
        this.value = value;
    }

    //���������
    public void setlNode(TreeNode lNode) {
        this.leftNode = lNode;
    }

    //�����Ҷ���
    public void setrNode(TreeNode rNode) {
        this.rightNode = rNode;
    }


    /**
     * �������ı���
     */
    //ǰ�����(��������)
    public void frontShow() {
        //�ȱ�����ǰ�ڵ�(���ڵ�);
        System.out.print(value);
        //��ڵ�
        if(leftNode!=null)
        {
            leftNode.frontShow();
        }
        //�ҽڵ�
        if(rightNode!=null)
        {
            rightNode.frontShow();
        }

    }
    //�������(�󣬸�����)
    public void midShow() {
        //�ȱ�����ڵ�
        if(leftNode!=null)
        {
            leftNode.midShow();
        }
        //�ڱ�����ǰ�ڵ�(���ڵ�);
        System.out.print(value);
        //����ҽڵ�
        if(rightNode!=null)
        {
            rightNode.midShow();
        }

    }
    //�������(���ң���)
    public void afterShow() {
        //����ڵ�
        if(leftNode!=null)
        {
            leftNode.afterShow();
        }
        //���ҽڵ�
        if(rightNode!=null)
        {
            rightNode.afterShow();
        }
        //��������ǰ�ڵ�(���ڵ�);
        System.out.print(value);
    }

    //��������
    public void setleftNode(TreeNode lNode) {
        this.leftNode = lNode;
    }
    //�����Һ���
    public void setrightNode(TreeNode rNode) {
        this.rightNode = rNode;
    }

    /**
     * �������Ĳ���
     */
    //ǰ�����
    public TreeNode frontSearch(int i) {

        TreeNode target=null;
        //�Աȵ�ǰ�ڵ��ֵ
        if(this.value==i)
        {
            return this;
            //��ǰ�ڵ��е�ֵ����Ҫ���ҵ�
        }else {
            //������ڵ�
            if(leftNode!=null)
            {
                //�п��ܿ��Բ鵽���п��ܲ��Ҳ������鲻���Ļ���target����null
                target=leftNode.frontSearch(i);
            }
            //�����Ϊ�գ�����ҳɹ�
            if(target!=null) {
                return target;
            }
            //�����ҽڵ�
            if(rightNode!=null)
            {
                target=rightNode.frontSearch(i);
            }
        }
        return target;

    }

    /**
     * ��������ɾ��
     */
    //ɾ��������������
    public void delete(int i) {
        TreeNode parent=this;
        //�ж�����
        if(parent.leftNode!=null&&parent.leftNode.value==i)
        {
            parent.leftNode=null;
            return;
        }
        //�ж��Һ���
        if(parent.rightNode!=null&&parent.rightNode.value==i)
        {
            parent.rightNode=null;
            return;
        }
        //���������,�ݹ��鲢ɾ������
        parent=leftNode;
        if(parent!=null)
        {
            parent.delete(i);
        }
        //�ݹ��鲢ɾ���Һ���
        parent=rightNode;
        if(parent!=null)
        {
            parent.delete(i);
        }

    }

}