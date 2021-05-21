/**
 * @author ChenWei
 * @create 2021-05-15-16:49
 */
public class ACA {
    public static void A(){
        System.out.println("1");
    }
  public static void main(String[] args) {
    //
    Thread t =
        new Thread() {
          public void run() {
              A();
          }
        };
    t.run();
    System.out.println("2");
  }
}
