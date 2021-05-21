package com.interviev;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ChenWei
 * @create 2021-05-15-13:56
 */
public class WeiSiDemo {
    public static boolean checkQiDui(List<Integer> piList){
        if(piList.size() != 14){
            return false;
        }

        for(int i = 0;i<piList.size();i=i+2){
//            System.out.println("piList.get(i) = " + piList.get(i));
//            System.out.println("piList.get(i+1) = " + piList.get(i+1));
            if(piList.get(i).equals(piList.get(i+1))){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void check(){
        List<Integer> piList = new ArrayList<>();
        List<Integer> piList2 = new ArrayList<>();
        List<Integer> piList3 = new ArrayList<>();
        List<Integer> piList4 = new ArrayList<>();

        piList.add(1);piList.add(2);//
        piList.add(4);piList.add(4);
        piList.add(12);piList.add(14);//
        piList.add(15);piList.add(15);
        piList.add(17);piList.add(17);
        piList.add(23);piList.add(23);
        piList.add(26);piList.add(26);

        piList2.add(1);piList.add(2);//
        piList2.add(4);piList2.add(4);
        piList2.add(14);piList2.add(14);
        piList2.add(15);piList2.add(15);
        piList2.add(17);piList2.add(17);
        piList2.add(23);piList2.add(23);
        piList2.add(26);piList2.add(26);

        piList3.add(2);piList3.add(2);
        piList3.add(4);piList3.add(4);
        piList3.add(12);piList3.add(14);//
        piList3.add(15);piList3.add(15);
        piList3.add(17);piList3.add(17);
        piList3.add(23);piList3.add(23);
        piList3.add(26);piList3.add(26);


        piList4.add(2);piList4.add(2);
        piList4.add(4);piList4.add(4);
        piList4.add(14);piList4.add(14);
        piList4.add(15);piList4.add(15);
        piList4.add(17);piList4.add(17);
        piList4.add(23);piList4.add(23);
        piList4.add(26);piList4.add(26);

        System.out.println("piList = " + checkQiDui(piList));
        System.out.println("piList2 = " + checkQiDui(piList2));
        System.out.println("piList3 = " + checkQiDui(piList3));
        System.out.println("piList4 = " + checkQiDui(piList4));
    }


    static int x = 10;
    static {
        x += 5;
    }

  public static void main(String[] args) {
    //
    System.out.println("x = " + x);

    Object o1 = true ? new Integer(1) : new Double(2.0);
    Object o2;
    if(true){
        o2 = new Integer(1);
    }else{
        o2 = new Double(2.0);
    }
    System.out.println("o1 = " + o1);
    System.out.println("o2 = " + o2);
  }
    static {
        x /= 3;
    }
}
