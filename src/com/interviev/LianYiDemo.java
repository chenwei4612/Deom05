package com.interviev;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ChenWei
 * @create 2021-05-18-17:01
 */
public class LianYiDemo  extends Thread{
    public static void A(){
        String str="";
        str +="bools";
        str = str+100;
        String str2 = str+"a";
    }

    private static int count = 0;
    public static int B(int x){
        count++;
        if(x<=3){
            return 1;
        }else{
            return B(x-2)+B(x-4)+1;
        }
    }

    public static double C(byte x, double y){
        return (short)x/y*2;
    }

    public static boolean D(String str){
        String pattern = "^\\d*\\*[^\\d]*[\\w]{6}$";
        //创建patteern对象
        Pattern r = Pattern.compile(pattern);
        //现在创建matcher对象
        Matcher m = r.matcher(str);
//        System.out.println(" m.matches() = " +  m.matches());
        return m.matches();
    }

    public static void E(){
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("1");
        System.out.println("list1 = " + list1);
        ArrayList<String> list2 = new ArrayList();
        list2.add("2");
        System.out.println("list2 = " + list2);
        ArrayList<Object> list3 = new ArrayList<>();
        list3.add("3");
        System.out.println("list3 = " + list3);
        ArrayList list4 = new ArrayList<String>();
        list4.add("4");
        System.out.println("list4 = " + list4);
    }

    public static void F(){
        try{
            int i = 1/0;
        }catch (ArithmeticException e){
            System.out.println("e1 = " + e);
        }catch (Exception e){
            System.out.println("e2 = " + e);
        }
    }

    public static void G(){
        int t = 1;
        int a = 2;
        int b = -1;
        if((a=b)>0){
            t=a++;
        }
        System.out.println("t = " + t);
    }

    public void start(){
        for (int i = 0;i<10;i++){
            System.out.println("i = " + i);
        }
    }

    static int a;
    public int H(){
        a++;
        return a;
    }
    public static void I(){
        try{
            System.out.println("hello,jr" );
        }finally{
            System.out.println("88" );
        }
    }
  public static void main(String[] args) {
        I();
//      LianYiDemo lianYiDemo = new LianYiDemo();
//      lianYiDemo.H();
//      System.out.println("lianYiDemo.H() = " + lianYiDemo.H());
//        LianYiDemo lianYiDemo = new LianYiDemo();
//        lianYiDemo.run();
//        G();
    //      B(8);
    //    System.out.println("B(8) = " + B(8));
    //      System.out.println(" B(B(8)) = " + B(B(8)));
    //    System.out.println("count = " + count);
//      String str = "***abcABCD_89";
//      String str1 = "abc*abcABCDEF";
//      String str2 = "123*abcABCD_89";
//      String str3 = "123*ABCDabcd-89";
//      System.out.println("D(str) = " + D(str));
//      System.out.println("D(str1) = " + D(str1));
//      System.out.println("D(str2) = " + D(str2));
//      System.out.println("D(str3) = " + D(str3));
//      E();
//      F();
  }
}

