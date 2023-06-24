import java.util.Scanner;

public class MyThread1 {
    public static void main(String[] args) {
        System.out.println("main");
        ThreadDemo1 threadDemo1=new ThreadDemo1();
        ThreadDemo2 threadDemo2=new ThreadDemo2();
        threadDemo1.start();
        threadDemo2.start();
    }
}
class ThreadDemo1 extends  Thread{
    @Override
    public void run() {
        System.out.println("Sum");
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        System.out.println(x+y);
        System.out.println("Thread ends.");
    }
}
class ThreadDemo2 extends  Thread{
    @Override
    public void run() {
        System.out.println("Thread 2");
        try {
            for (int i = 0; i <3 ; i++) {
                System.out.println("Ayush");
                Thread.sleep(2000);
            }
        }
        catch (Exception exception)
        {
            System.out.println("Something Wrong !!");
        }
        System.out.println("Done from thread 2.");
    }
}
