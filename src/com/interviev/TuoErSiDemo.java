package com.interviev;

/**
 * @author ChenWei
 * @create 2021-05-17-21:40
 */
public class TuoErSiDemo {
    public static int AAA(int x){
        int count = 0;
//        System.out.println("Math.sqrt(x) = " + Math.sqrt(x));
        double a = Math.sqrt(x);
        int b = (int)a;
        if(a%b != 0){
            return 0;
        }else{
            count++;
        }

        if(b>10){
            b = (b/10)*(b%10)*b;
        }
        while(b>=10){
            b = (b/10)*(b%10);
            count++;
        }

        return count;
    }
  public static void main(String[] args) {
      System.out.println("AAA(6) = " + AAA(6));
      System.out.println("AAA(9) = " + AAA(9));
      System.out.println("AAA(81) = " + AAA(81));
      System.out.println("AAA(256) = " + AAA(256));
  }
}
