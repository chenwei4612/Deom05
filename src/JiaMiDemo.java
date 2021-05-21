/**
 * @author ChenWei
 * @create 2021-05-15-15:54
 */
public class JiaMiDemo {

    public static void jiaMi(int data){
        System.out.println("加密前 data = " + data);
        int[] arr = new int[4];
        //四位数字
        boolean flag = false;
        if(data > 10000 ){
            System.out.println("该数字不是四位数！！！");
        }else if(data <-9999){
            System.out.println("该数字不是四位数！！！");
        }else{
            flag = true;
        }
        if(flag){
            //取每位数字
            int i = 0;
            while(data > 0){
                arr[i] = data % 10;
                i++;
                data /= 10;

            }
//            show(arr);
            //每位数字加五
            for(int j = 0;j<arr.length;j++){
                arr[j] += 5;
            }
//            show(arr);
            //和除于10的余数代替该数字
            for(int j = 0;j<arr.length;j++){
                arr[j] = arr[j] % 10;
            }
//            show(arr);
            //1-4,2-3交换
            data = arr[0]*1000+arr[1]*100+arr[2]*10+arr[3];
            System.out.println("加密后 data = " + data);
        }

    }

    public static void jiaMi2(int data){
        System.out.println("加密前 data = " + data);
        int[] arr = new int[4];
        //四位数字
        boolean flag = false;
        if(data > 10000 ){
            System.out.println("该数字不是四位数！！！");
        }else if(data <-9999){
            System.out.println("该数字不是四位数！！！");
        }else{
            flag = true;
        }
        if(flag){
            //取每位数字
            int i = 0;
            while(data > 0){
                arr[i] = ((data % 10) + 5) % 10;
                i++;
                data /= 10;

            }
            //1-4,2-3交换
            data = arr[0]*1000+arr[1]*100+arr[2]*10+arr[3];
            System.out.println("加密后 data = " + data);
        }

    }

    public static void show(int[] arr){
        for (int i : arr){
            System.out.print("i = " + i+" ");
        }
        System.out.println();
    }


    //解密过程
    public int jiemi(int x) {
        //将加密后的数进行拆分
        int a=x/1000;
        int b=x%1000/100;
        int c=x%100/10;
        int d=x%10;
        //每位数字都加上5,然后用和除以10的余数代替该数字
        a=(a+5)%10;
        b=(b+5)%10;
        c=(c+5)%10;
        d=(d+5)%10;
        x=1000*d+100*c+10*b+a;
        return x;
    }

    //解密过程
    public int jiemi2(int x) {
        //将加密后的数进行拆分
        int a=x/1000;
        int b=x%1000/100;
        int c=x%100/10;
        int d=x%10;
        //每位数字都加上5,然后用和除以10的余数代替该数字
        a=(a+5)%10;
        b=(b+5)%10;
        c=(c+5)%10;
        d=(d+5)%10;
        x=1000*d+100*c+10*b+a;
        return x;
    }

  public static void main(String[] args) {
    //
      jiaMi(12345);
      jiaMi(-10000);
      System.out.println("------------加密------------------");
      jiaMi(1234);
      System.out.println("------------解密------------------");
      jiaMi(9876);
      System.out.println("------------------------------");
      System.out.println("------------加密------------------");
      jiaMi2(1234);
      System.out.println("------------解密------------------");
      jiaMi2(9876);

      System.out.println("------------------------------");
      System.out.println("------------加密------------------");
      jiaMi2(9999);
      System.out.println("------------解密------------------");
      jiaMi2(4444);
  }
}
