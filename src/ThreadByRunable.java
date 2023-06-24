public class ThreadByRunable {
    public static void main(String[] args) {
        System.out.println("Main Start");
        MyThreads myThreads=new MyThreads();
        Thread thread=new Thread(myThreads);
        thread.start();
        System.out.println("Main Ends");
    }
}
class MyThreads implements Runnable
{
    @Override
    public void run() {
        System.out.println("This is Ayush");
    }
}