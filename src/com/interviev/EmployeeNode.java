package com.interviev;

/**
 * @author ChenWei
 * @create 2021-05-10-22:45
 */
public class EmployeeNode{
    private String emp_id;
    private String name;
    private EmployeeNode left; //默认null
    private EmployeeNode right; //默认null

    public EmployeeNode(String emp_id, String name) {
        this.emp_id = emp_id;
        this.name = name;
    }

    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmployeeNode getLeft() {
        return left;
    }

    public void setLeft(EmployeeNode left) {
        this.left = left;
    }

    public EmployeeNode getRight() {
        return right;
    }

    public void setRight(EmployeeNode right) {
        this.right = right;
    }

    //编写前序遍历的方法
    public void preOrder() {
        System.out.println(this); //先输出父结点

        //递归向左子树前序遍历
        if(this.left != null) {
            System.out.print("-");
            this.left.preOrder();
        }
        //递归向右子树前序遍历
        if(this.right != null) {
            System.out.print("-");
            this.right.preOrder();
        }


    }
    //中序遍历
    public void infixOrder() {

        //递归向左子树中序遍历
        if(this.left != null) {
            this.left.infixOrder();
        }
        //输出父结点
        System.out.println(this);
        //递归向右子树中序遍历
        if(this.right != null) {
            this.right.infixOrder();
        }
    }
    //后序遍历
    public void postOrder() {
        if(this.left != null) {
            this.left.postOrder();
        }
        if(this.right != null) {
            this.right.postOrder();
        }
        System.out.println(this);
    }

    //前序遍历查找
    /**
     *
     * @param emp_id 查找emp_id
     * @return 如果找到就返回该Node ,如果没有找到返回 null
     */
    public EmployeeNode preOrderSearch(String emp_id) {
        System.out.println("进入前序遍历");
        //比较当前结点是不是
        if(this.emp_id == emp_id) {
            return this;
        }
        //1.则判断当前结点的左子节点是否为空，如果不为空，则递归前序查找
        //2.如果左递归前序查找，找到结点，则返回
        EmployeeNode resNode = null;
        if(this.left != null) {
            resNode = this.left.preOrderSearch(emp_id);
        }
        if(resNode != null) {//说明我们左子树找到
            return resNode;
        }
        //1.左递归前序查找，找到结点，则返回，否继续判断，
        //2.当前的结点的右子节点是否为空，如果不空，则继续向右递归前序查找
        if(this.right != null) {
            resNode = this.right.preOrderSearch(emp_id);
        }
        return resNode;
    }

    //中序遍历查找
    public EmployeeNode infixOrderSearch(String emp_id) {
        //判断当前结点的左子节点是否为空，如果不为空，则递归中序查找
        EmployeeNode resNode = null;
        if(this.left != null) {
            resNode = this.left.infixOrderSearch(emp_id);
        }
        if(resNode != null) {
            return resNode;
        }
        System.out.println("进入中序查找");
        //如果找到，则返回，如果没有找到，就和当前结点比较，如果是则返回当前结点
        if(this.emp_id == emp_id) {
            return this;
        }
        //否则继续进行右递归的中序查找
        if(this.right != null) {
            resNode = this.right.infixOrderSearch(emp_id);
        }
        return resNode;

    }

    //后序遍历查找
    public EmployeeNode postOrderSearch(String emp_id) {

        //判断当前结点的左子节点是否为空，如果不为空，则递归后序查找
        EmployeeNode resNode = null;
        if(this.left != null) {
            resNode = this.left.postOrderSearch(emp_id);
        }
        if(resNode != null) {//说明在左子树找到
            return resNode;
        }

        //如果左子树没有找到，则向右子树递归进行后序遍历查找
        if(this.right != null) {
            resNode = this.right.postOrderSearch(emp_id);
        }
        if(resNode != null) {
            return resNode;
        }
        System.out.println("进入后序查找");
        //如果左右子树都没有找到，就比较当前结点是不是
        if(this.emp_id == emp_id) {
            return this;
        }
        return resNode;
    }

    @Override
    public String toString() {
//        return "EmployeeNode{" + "emp_id='" + emp_id + '\'' +'}';
        return  emp_id ;
    }
}
