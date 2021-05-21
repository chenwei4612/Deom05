import javax.lang.model.SourceVersion;

/**
 * @author ChenWei
 * @create 2021-05-15-13:46
 */
public class ABCD {
    private static int x = 100;

    public static int A(int i) throws Exception{
        try{
            return i/10;
        }catch (Exception ex){
            throw new Exception("Exception in Method");
        }finally{
            System.out.println("finally");
        }
    }

    public static void main(String[] args) {
        /*ABCD a1 = new ABCD();
        a1.x++;
        System.out.println("x = " + x);
        ABCD a2 = new ABCD();
        a1.x++;
        System.out.println("x = " + x);
        a1 = new ABCD();
        a1.x++;
        System.out.println("x = " + x);
        ABCD.x--;
        System.out.println("x = " + x);*/


        try{
            A(0);
        }catch (Exception ex){
            System.out.println("Exception in Method");
        }finally{
            System.out.println("finished");
        }
    }
}
