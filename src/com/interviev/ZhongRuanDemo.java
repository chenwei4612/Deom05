package com.interviev;

/**
 * @author ChenWei
 * @create 2021-05-17-21:25
 */
public class ZhongRuanDemo {
    public static int A(int x){
        if(x<=0){
            return 0;
        }else if(x == 1){
            return 1;
        }else{
            return x*A(x-1);
        }
    }
    public static void B(int x){
        if(x>0){
            System.out.println("First " );
        }else if(x>-3){
            System.out.println("Second " );
        }else {
            System.out.println("Third " );
        }
    }

    public static String output = "";

    public static void C(int i){
        try{
            if(i==1){
                throw new Exception();
            }
            output +="1";
        }catch(Exception e){
            output +="2";
            return ;
        }finally{
            output +="3";
        }
        output +="4";

    }

    public static void D(String str){
        str += "world!";
    }
    public static void D(StringBuffer str){
        str.append("world!");
    }
  public static void main(String[] args) {
    //
    //    System.out.println("A(5) = " + A(5));
    //    B(1);
    //    B(-2);
    //    B(-3);
    //    B(0);
//      C(0);
//      System.out.println("output = " + output);
//      C(1);
//      System.out.println("output = " + output);
      String str = new String("Hello");
      D(str);
      System.out.println("str = " + str);
      StringBuffer s = new StringBuffer("Hello");
      D(s);
      System.out.println("s = " + s);
  }
}

