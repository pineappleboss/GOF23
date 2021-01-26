package BaseKnownledge;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * @author tiankaiqiang
 * @version 1.0
 * @date 2021/1/13 15:34
 * @describe 用来描述当一个线程必须使用另外一个线程的返回结果，然后将两者得到的结果共同处理或者要对其先进行处理
 * callable可以返回值，用来处理
 */
public class TestFuture {
    public static void main(String[] args) {
        Chuju cj=new Chuju();
        FutureTask<Chuju> task=new FutureTask<Chuju>(cj);
        System.out.println("shop begin");
        new Thread(task).start();
        if(!task.isDone()) System.out.println("等待");//表示如果这个线程没有执行完，可以做其他的事
        try {
            task.get();
            System.out.println("shop success");
            System.out.println("begin cook");
            Thread.sleep(3000);
            System.out.println("cook success");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
class Chuju implements Callable {

    public Chuju call() throws Exception {
        Thread.sleep(3000);

        return new Chuju();
    }
}


