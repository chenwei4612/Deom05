import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ChenWei
 * @create 2021-05-13-10:08
 */
public class Test0513 {
  public static void find() {
    List<Map<String, Object>> yMap = new ArrayList<Map<String, Object>>();
        // 对比是否存在相同的信息，有则合并
        for (int i = 0; i < yMap.size(); i++) {
          Map<String, Object> map1 = yMap.get(i);
          for (int j = i + 1; j < yMap.size(); j++) {
            Map<String, Object> map2 = yMap.get(j);
            if (map1.get("iphone").toString().equals(map2.get("iphone").toString())) {
              Double value =
                  Double.valueOf(map1.get("value").toString())
                      + Double.valueOf(map2.get("value").toString());
              // 相同的数据累加值，并且重新赋值
              yMap.get(i).put("value", value);
              // 删除已合并的map信息避免重复比较导致数据错误
              yMap.remove(j);
              continue;
            }
          }
        }
  }
  public static void find2(List<Map<String, String>> listMap){
      for (int i = 0; i < listMap.size(); i++) {
          Map<String, String> map1 = listMap.get(i);
          for (int j = i + 1; j < listMap.size(); j++) {
              Map<String, String> map2 = listMap.get(j);
              if (map1.get("A").toString().equals(map2.get("A").toString())) {
                  // 删除已合并的map信息避免重复比较导致数据错误
                  listMap.remove(j);
                  continue;
              }
              if (map1.get("B").toString().equals(map2.get("B").toString())) {
                  // 删除已合并的map信息避免重复比较导致数据错误
                  listMap.remove(j);
                  continue;
              }
              if (map1.get("C").toString().equals(map2.get("C").toString())) {
                  // 删除已合并的map信息避免重复比较导致数据错误
                  listMap.remove(j);
                  continue;
              }
          }
      }
  }

    public static void main(String[] args) {
    //
        /*String str = null;
        List<Map<String, String>> listMap =  new ArrayList<>();
        Map<String,String> map1 = new HashMap();
        map1.put("A","A");
        map1.put("B","B");
        map1.put("C","C");
        Map<String,String> map2 = new HashMap();
        map2.put("A","B");
        map2.put("B","C");
        map2.put("C","A");
        Map<String,String> map3 = new HashMap();
        map3.put("A","C");
        map3.put("B","A");
        map3.put("C","B");
        listMap.add(map1);
        listMap.add(map1);
        listMap.add(map2);
        listMap.add(map3);
        listMap.add(map3);
        listMap.add(map2);
        System.out.println("listMap = " + listMap.toString());
        find2(listMap);
        System.out.println("listMap = " + listMap.toString());*/
        
//        Short s1 =1; s1 = s1+1;
        short s2 = 1;
        s2 += 1;
    System.out.println("s2 = " + s2);
  }
}
class Something{
    void doSomething(){
//        private String str = "";
//        int i = str.length();
    }
//    public int addOne(final int x){
//        return ++x;
//    }
}

class MyClass{

    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

