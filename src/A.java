/**
 * @author ChenWei
 * @create 2021-05-13-11:45
 */
public class A{
    public A() {
        System.out.println("A A()");
    }
    public static void show(){
        System.out.println("A show()");
    }
}
class B extends A{
    public B() {
        System.out.println("B B()");
    }
    public static void show(){
        System.out.println("B show()");
    }
}
class C extends B{
    public C() {
        System.out.println("C C()");
    }

    public static void main(String[] args) {
        //
        A c = new C();
        c.show();
    }
}
