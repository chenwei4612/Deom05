import java.util.Stack;

/**
 * @author ChenWei
 * @create 2021-05-12-22:00
 */
public class Test0512 {
    public static Stack<Integer> stack = new Stack<Integer>();
    public static int count = 0;

    /**
     *1 2 3 4 选择可重复
     * @param shu   待选择的数组
     * @param targ  要选择多少个次
     * @param cur   当前选择的是第几次
     */
    private static void f(int[] shu, int targ, int cur) {
        // TODO Auto-generated method stub
        if(cur == targ) {
            System.out.println(stack);
            return;
        }

        for(int i=0;i<shu.length;i++) {
            stack.add(shu[i]);
            f(shu, targ, cur+1);
            stack.pop();

        }
    }

    /**
     *1 2 3 4 不可重复
     * @param shu   待选择的数组
     * @param targ  要选择多少个次
     * @param cur   当前选择的是第几次
     */
    private static void f2(int[] shu, int targ, int cur) {
        // TODO Auto-generated method stub
        if(cur == targ) {
            System.out.println(stack);
            count += stack.size();
            return;
        }

        for(int i=0;i<shu.length;i++) {
            if(!stack.contains(shu[i])) {
                stack.add(shu[i]);
                f2(shu, targ, cur+1);
                stack.pop();
            }

        }
    }

    /**
     *1 2 3 4 取n个
     * @param shu  元素
     * @param targ  要选多少个元素
     * @param has   当前有多少个元素
     * @param cur   当前选到的下标
     *
     * 1    2   3     //开始下标到2
     * 1    2   4     //然后从3开始
     */
    private static void f3(int[] shu, int targ, int has, int cur) {
        if(has == targ) {
            System.out.println(stack);
            return;
        }

        for(int i=cur;i<shu.length;i++) {
            if(!stack.contains(shu[i])) {
                stack.add(shu[i]);
                f3(shu, targ, has+1, i);
                stack.pop();
            }
        }

    }

    public static void A(){
        Integer integer1 = 3;
        Integer integer2 = 3;
        if (integer1 == integer2)
            System.out.println("integer1 == integer2");
        else
            System.out.println("integer1 != integer2");

        if (integer1.equals(integer2))
            System.out.println("integer1 == integer2");
        else
            System.out.println("integer1 != integer2");

        Integer integer3 = 300;
        Integer integer4 = 300;
        if (integer3 == integer4)
            System.out.println("integer3 == integer4");
        else
            System.out.println("integer3 != integer4");

        if (integer3.equals(integer4))
            System.out.println("integer3 == integer4");
        else
            System.out.println("integer3 != integer4");
    }

  public static void main(String[] args) {
    //
//      String mx#da;
      String $_aa;
      String D12132;
      String String = "String";
      int[] arr = {1,2,3,4};
//      f2(arr, 3, 0);
      System.out.println("-------------------------");
//      System.out.println("count = " + count);
//      f3(arr, 3, 0, 0);
//      Integer a=1;
//      System.out.println(a==1?"等于":"不等于");
//      Boolean bool=false;
//      System.out.println(bool?"真":"假");



//      Integer a1=1;
//      System.out.println(a1.intValue()==1?"等于":"不等于");
//      Boolean bool1=false;
//      System.out.println(bool1.booleanValue?"真":"假");

      A();
  }
}
