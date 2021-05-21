package com.interviev;

/**
 * @author ChenWei
 * @create 2021-05-20-15:19
 */
public class ZhuYunDemo extends BBB{
    private String ZhuYunDemo = "ZhuYunDemo ";
    public ZhuYunDemo() {
        System.out.println("ZhuYunDemo ");
    }

    public void A(){
        int i = 0;
    }
    public static int[] B(int[] arr){
        int temp = 0;
        for(int i = 0;i<arr.length-1;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void C(int[] arr){
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
  public static void main(String[] args) {
    //
//      int[] arr = {1,8,6,4,7,3,2,9,88,5,12,0};
//      B(arr);
//      C(arr);
      ZhuYunDemo zyd = new ZhuYunDemo();
  }
}
class AAA{
    private String AAA = "AAA";
    public AAA() {
         System.out.println("AAA");
    }
}

class BBB extends AAA{
    private String BBB = "BBB";
    public BBB() {
        System.out.println("BBB");
    }
}