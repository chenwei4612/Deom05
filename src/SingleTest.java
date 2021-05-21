/**
 * @author ChenWei
 * @create 2021-05-15-12:19
 */
public class SingleTest {
    private static SingleTest singleTest;

    public SingleTest() {

    }

    public static synchronized SingleTest getInstance(){
        if(singleTest == null){
            singleTest = new SingleTest();
        }
        return singleTest;
    }

    public static SingleTest getInstance2(){
        if (singleTest == null){
            synchronized (SingleTest.class){
                singleTest = new SingleTest();
            }
        }
        return singleTest;
    }

    public static synchronized SingleTest getInstance3(){
        if (singleTest == null){
            synchronized (SingleTest.class){
                if (singleTest == null){
                    singleTest = new SingleTest();
                }
            }
        }
        return singleTest;
    }

    private static volatile SingleTest instance;
    private static class SingleTestInstance{
        private static final SingleTest INSTANCE = new SingleTest();
    }

    public static synchronized SingleTest getInstance4(){

        return SingleTestInstance.INSTANCE;
    }
}
