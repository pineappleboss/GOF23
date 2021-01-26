package BaseKnownledge;


import java.io.*;
import java.util.Arrays;

/**
 * @author tiankaiqiang
 * @version 1.0
 * @date 2021/1/13 9:45
 * @describe 不对输入流进行非-1判断可能会读出非法字符 \u0000'
 * 可理解为，字节输入流是将文件读进一个字节数组当中，字节输出流是将字节数组写道一个文件中。在写的时候要去除那些异常的字符串。
 * 字符流也是同样字符输入流是将文件读进一个字符数组当中，字符输出流是将字符数组写道一个文件中。两者都可以用装饰流进行装饰提高效率。
 */
public class TestIo {
    public static void main(String[] args) {
        ByteStreamTest();
    }
    private static  void ByteStreamTest(){
        InputStream is = null;
        OutputStream os = null;
        try {
            is= new BufferedInputStream( new FileInputStream(new File("D:\\workspace\\GOF23\\src\\main\\java\\BaseKnownledge\\TestEquals.java")));
            //字节数组长度要大于文件大小
            byte[] bytei=new byte[1024];

            int len=-1;
            while ((len=is.read(bytei))!=-1){
                os=new FileOutputStream("D:\\workspace\\GOF23\\src\\main\\java\\BaseKnownledge\\TestEquals1.txt");
                //去除字节数组中的空字符
                byte[] byteo=Arrays.copyOf(bytei,len);
                /**
                 * 字符串和字节数组之间进行转换
                 */
                String string=new String(byteo, 0, len);
                byte[] sby=string.getBytes();

                os.write(byteo);
                os.flush();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                is.close();
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
    private static void CharStreamTest(){
        Reader reader=null;
        Writer writer=null;
        try {
            reader= new BufferedReader(new FileReader("D:\\workspace\\GOF23\\src\\main\\java\\BaseKnownledge\\TestEquals.java"));
            char[] charsr=new char[1024];
            int len=-1;
            while ((len=reader.read(charsr))!=-1){
                char[] charsw=Arrays.copyOf(charsr,len);
                Arrays.asList(charsw).stream().forEach(w->System.out.println(w));
                writer=new FileWriter("D:\\workspace\\GOF23\\src\\main\\java\\BaseKnownledge\\TestEquals1.java");
                writer.write(charsw);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                 writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
