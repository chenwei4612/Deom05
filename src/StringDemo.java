import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ChenWei
 * @create 2021-05-11-14:55
 */
public class StringDemo {
    public static void StringTest(String str){
//        String str = "abcdefgh-IJKLMNO-123456789";
        System.out.println("str = " + str);
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println("stringBuffer = " + stringBuffer);
        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println("stringBuilder = " + stringBuilder);
        System.out.println("----------------------------------");
        System.out.println("stringBuffer = " + stringBuffer.reverse());
        System.out.println("stringBuilder = " + stringBuilder.reverse());
        System.out.println("str = " + str);
    }

    public static void list_arr(){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        show_arr(arr);
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("1");
        list.add("@");
        show_list(list);
        System.out.println("-------------------------------------");
    //        List<int[]> arr_list = new ArrayList<>();
    //        arr_list = Arrays.asList(arr);
    //        show_list(arr_list);
    //        System.out.println("arr_list = " + arr_list.toString());
        String[] arr2 = {"1", "2", "3", "4", "5","6","7","8", "9"};
        show_list(Arrays.asList(arr2));
        String[] str2 = list.toArray(new String[0]);
        show_arr(str2);
    }

    public static void show_arr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
            System.out.println();
    }
    public static void show_arr(String[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void show_list(List<String> list){
        for(String str : list){
            System.out.print(str+" ");
        }
            System.out.println();
    }
  public static void main(String[] args) {
    //
      list_arr();
  }
}
