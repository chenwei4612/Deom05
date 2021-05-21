/**
 * @author ChenWei
 * @create 2021-05-12-22:52
 */
public class t2 {
    private static int i = 1;

    public static int getNext() {
        return i++;
    }

    public static boolean A(char c){
        System.out.println("c = " + c);
        return true;
    }

  public static void main(String[] args) {
    //
      t2 a1 = new t2();
      t2 a2 = new t2();
      a1.getNext();
      a2.getNext();
      System.out.println("a2 = " + a2.getNext());
      int j = 0;
      for( A('A'); A('B') && (j<2); A('C')){
          j++;
          A('D');
      }
  }
}
