package com.interviev;

/**
 * @author ChenWei
 * @create 2021-05-10-22:45
 */
public class Employee{
    private EmployeeNode employeeNode;
    private String name;
    private int sex;
    private int age;

    public EmployeeNode getEmployeeNode() {
        return employeeNode;
    }

    public void setEmployeeNode(EmployeeNode employeeNode) {
        this.employeeNode = employeeNode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    //前序遍历
    public void preOrder() {
        if(this.employeeNode != null) {
            this.employeeNode.preOrder();
        }else {
            System.out.println("employeeNode为空，无法遍历");
        }
    }

    //中序遍历
    public void infixOrder() {
        if(this.employeeNode != null) {
            this.employeeNode.infixOrder();
        }else {
            System.out.println("employeeNode为空，无法遍历");
        }
    }
    //后序遍历
    public void postOrder() {
        if(this.employeeNode != null) {
            this.employeeNode.postOrder();
        }else {
            System.out.println("employeeNode为空，无法遍历");
        }
    }

    //前序遍历
    public EmployeeNode preOrderSearch(String emp_id) {
        if(employeeNode != null) {
            return employeeNode.preOrderSearch(emp_id);
        } else {
            return null;
        }
    }
    //中序遍历
    public EmployeeNode infixOrderSearch(String emp_id) {
        if(employeeNode != null) {
            return employeeNode.infixOrderSearch(emp_id);
        }else {
            return null;
        }
    }
    //后序遍历
    public EmployeeNode postOrderSearch(String emp_id) {
        if(employeeNode != null) {
            return this.employeeNode.postOrderSearch(emp_id);
        }else {
            return null;
        }
    }
}


