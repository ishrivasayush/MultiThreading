public class YieldMethod {
    public static void main(String[] args) {
      Thread1 thread1=new Thread1();
      Thread2 thread2=new Thread2();
      thread1.start();
      thread2.start();
    }
}
class Thread1 extends Thread{

    @Override
    public void run() {
        for (int i = 1; i <10 ; i++) {

                Thread.yield();

            System.out.println(i);
        }
        System.out.println("End");
    }
}
class Thread2 extends Thread{
    @Override
    public void run()  {
        System.out.println("start from thread 1");
        for (int i = 1; i <10 ; i++) {

            System.out.println("End from Thread "+ Thread.currentThread().getName()+i);
        }
    }
}
