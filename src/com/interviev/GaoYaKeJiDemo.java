package com.interviev;

import java.util.Vector;

/**
 * @author ChenWei
 * @create 2021-05-10-18:06
 */
public class GaoYaKeJiDemo {
    public static int findMsg(Vector<Integer> v){
        boolean flag = true;
        int t = -1;
        for (int i = 1;i<v.size();i++){
            for (int j = 0;j<v.size();j++){
                if(i == v.get(j)){
                    flag = true;
                    t = -1;
                    break;
                }else{
                    flag = false;
                    t = i;
                }
            }
            if (!flag){
                return t;
            }
        }
        return -1;
    }


    public static void findMaxCount(int[] arr){
        int count = 1;
        int temp = arr[0];
        for (int i = 1;i<arr.length;i++){
            if(temp == arr[i]){
                count++;
            }else if (temp<arr[i]){
                count = 1;
                temp = arr[i];
            }
        }
        System.out.println("最大的数为： "+temp+" 出现次数： "+count);
    }

  public static void main(String[] args) {
      Vector<Integer> v = new Vector();
      v.add(1);
      v.add(9);
      v.add(7);
      v.add(4);
      v.add(3);
      v.add(6);
      v.add(5);
      v.add(8);
      System.out.println( findMsg(v));
      int[] arr = {5,7,8,1,2,3,3,5,4,5,8,7,4,5,8,8,4,4,9,1,0};
      findMaxCount(arr);

      Employee employeeA = new Employee();


      EmployeeNode rootA = new EmployeeNode("A", "A");
      EmployeeNode rootB = new EmployeeNode("B", "B");
      EmployeeNode rootC = new EmployeeNode("C", "C");
      EmployeeNode rootD = new EmployeeNode("D", "D");
      EmployeeNode rootE = new EmployeeNode("E", "E");
      EmployeeNode rootF = new EmployeeNode("F", "F");
      EmployeeNode rootG = new EmployeeNode("G", "G");
      EmployeeNode rootH = new EmployeeNode("H", "H");
      EmployeeNode rootI = new EmployeeNode("I", "I");


      rootA.setLeft(rootB);
      rootA.setRight(rootC);

      rootB.setLeft(rootD);
      rootB.setRight(rootE);

      rootC.setLeft(rootF);
      rootC.setRight(rootG);

      rootD.setLeft(rootH);
      rootD.setRight(rootI);


      employeeA.setEmployeeNode(rootB);
      employeeA.preOrder();
//      employeeA.infixOrder();

      String abc = new String("a"+"b"+"c");
  }
}
