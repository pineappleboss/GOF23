package BaseKnownledge;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author tiankaiqiang
 * @version 1.0
 * @date 2021/1/13 13:57
 * @describe
 */
public class TestThreadPools {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        TestThread2 t1=new TestThread2();
//        TestThread2 t2=new TestThread2();
        executorService.execute(t1);
        executorService.execute(t1);
    }
}
