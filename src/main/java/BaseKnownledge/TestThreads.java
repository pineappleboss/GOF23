package BaseKnownledge;

/**
 * @author tiankaiqiang
 * @version 1.0
 * @date 2021/1/13 9:44
 * @describe
 */
public class TestThreads {
    public static void main(String[] args) {
        TestThread2 t=new TestThread2();
        new Thread(t).start();
        new Thread(t).start();
    }
}
class TestThread2 implements Runnable{
   private int i=100;
    public synchronized void run() {

            while (i>0){
//                this.notify();
//                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName()+ "######"+i--);
//                this.wait();
            }

    }
}
