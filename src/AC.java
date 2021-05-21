import java.util.ArrayList;
import java.util.List;

/**
 * @author ChenWei
 * @create 2021-05-15-11:39
 */
public class AC {

    private List<List<Integer>> res = new ArrayList<>();

    //声明一个布尔数组，用来判断某个索引位置的数字是否被使用过了
    private boolean[] used;

    public List<List<Integer>> permute(int[] nums) {
        if (nums.length == 0) {
            return res;
        }

        used = new boolean[nums.length];
        List<Integer> preList = new ArrayList<>();
        generatePermutation(nums, 0, preList);

        return res;

    }

    /**
     * 回溯
     * @param nums 给定数组
     * @param index 当前考察的索引位置
     * @param preList 先前排列好的子序列
     */
    private void generatePermutation(int[] nums,int index,List<Integer> preList) {
        //index 等于给定数组的长度时，说明一种排列已经形成，直接将其加入成员变量 res 里
        if (index == nums.length) {
            //这里需要注意java的值传递
            //此处必须使用重新创建对象的形式，否则 res 列表中存放的都是同一个引用
            res.add(new ArrayList<>(preList));
            return;
        }

        for(int i = 0; i < nums.length ;i++) {
            if (!used[i]) {
                preList.add(nums[i]);
                used[i] = true;
                generatePermutation(nums, index + 1, preList);
                //一定要记得回溯状态
                preList.remove(preList.size() - 1);
                used[i] = false;
            }
        }
        return;
    }


    /**
     * 排列
     * @param m
     * @param n
     * @return
     */
    public static int A(int n,int m){
        int result = 1;
        for(int i = m; i > 0;i--){
            result *= n;
            n--;
        }
        return result;
    }




//    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        if (n <= 0 || k <= 0 || k > n) {
            return res;
        }

        List<Integer> c = new ArrayList<>();
        generateCombinations(n, k, 1, c);
        return res;

    }

    /**
     * 回溯求所有组合结果
     * @param n
     * @param k
     * @param start 开始搜索新元素的位置
     * @param c 当前已经找到的组合
     */
    private void generateCombinations(int n,int k,int start,List<Integer> c) {
        if (c.size() == k) {
            //这里需要注意java的值传递
            //此处必须使用重新创建对象的形式，否则 res 列表中存放的都是同一个引用
            res.add(new ArrayList<>(c));
            return;
        }

        //通过终止条件，进行剪枝优化，避免无效的递归
        //c中还剩 k - c.size()个空位，所以[ i ... n]中至少要有k-c.size()个元素
        //所以i最多为 n - (k - c.size()) + 1
        for(int i = start;i <= n - (k - c.size()) + 1; i++) {
            c.add(i);
            generateCombinations(n, k, i + 1, c);
            //记得回溯状态啊
            c.remove(c.size() - 1);
        }
    }


    /**
     *
     * @param n
     * @param m
     * @return
     */
    public static int C(int n, int m){
        // 应用组合数的互补率简化计算量
        m = m > (n - m) ? (n - m) : m;
        // 分子的排列数
        int son = A(n, m);
        // 分母的排列数
        int mother = A(m, m);
        return son / mother ;
    }

    public static int C2(int n,int m) {
        //分子
        int son = 1;
        //分母
        int mother = 1;
        // 应用组合数的互补率简化计算量
        m = m > (n - m) ? (n - m) : m;
        for(int i = m;i > 0; i--) {
            //如果你还记得上面的求全排列数的实现，你应该会发现 son 就是在求 A(n，m)
            son *= n;
            mother *= i;
            n--;
        }
        return son / mother;
    }


    public static void main(String[] args) {
    //
    System.out.println("result = " + A(3,3));
  }
}
