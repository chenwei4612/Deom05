import java.io.*;

/**
 * @author ChenWei
 * @create 2021-05-07-16:20
 */
public class TestIO {
    public static void create_file(boolean flag){
        //在项目的根目录下创建一个a文件夹
        File file = new File("a/b/c");
        if(flag){
            //创建目录
            if(file.mkdirs()){
                System.out.println("成功！");
            }else{
                System.out.println("失败！");
            }
        }else{
            //删除目录
            if(file.delete()){
                System.out.println("删除成功");
            }else{
                System.out.println("删除失败");
            }
        }

    }


    /**
     * 读取指定文件的内容
     * @param filePath ： 文件的路径
     * @return  返回的结果
     */
    public String readFile( String filePath ){
        FileInputStream fis=null;
        String result = "" ;
        try {
            // 根据path路径实例化一个输入流的对象
            fis  = new FileInputStream( filePath );
            //2. 返回这个输入流中可以被读的剩下的bytes字节的估计值；
            int size =  fis.available() ;
            //3. 根据输入流中的字节数创建byte数组；
            byte[] array = new byte[size];
            //4.把数据读取到数组中；
            fis.read( array ) ;
            //5.根据获取到的Byte数组新建一个字符串，然后输出；
            result = new String(array);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }finally{
            if ( fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return result ;
    }

    /**
     * 根据文件路径创建输出流
     * @param filePath ： 文件的路径
     * @param content : 需要写入的内容
     */
    public void writeFile( String filePath , String content ){
        FileOutputStream fos = null ;
        try {
            //1、根据文件路径创建输出流
            fos  = new FileOutputStream( filePath );

            //2、把string转换为byte数组；
            byte[] array = content.getBytes() ;
            //3、把byte数组输出；
            fos.write( array );

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }finally{
            if ( fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 文件复制
     * @param filePath_old : 需要复制文件的路径
     * @param filePath_new : 复制文件存放的路径
     */
    public void copyFile( String filePath_old  , String filePath_new){
        FileInputStream fis=null ;
        FileOutputStream fout = null ;
        try {
            // 根据path路径实例化一个输入流的对象
            fis  = new FileInputStream( filePath_old );

            //2. 返回这个输入流中可以被读的剩下的bytes字节的估计值；
            int size =  fis.available() ;
            //3. 根据输入流中的字节数创建byte数组；
            byte[] array = new byte[size];
            //4.把数据读取到数组中；
            fis.read( array ) ;

            //5、根据文件路径创建输出流
            fout = new FileOutputStream( filePath_new ) ;

            //5、把byte数组输出；
            fout.write( array );

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }finally{
            if ( fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if ( fout != null ) {
                try {
                    fout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
