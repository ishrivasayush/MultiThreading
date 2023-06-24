import java.util.Scanner;

public class MultipleThreadByRun {
    public static void main(String[] args) {
        Threads threads1=new Threads();
        Threads threads2=new Threads();
        threads2.setName("Show");
        threads1.setName("CALCY");
        threads2.start();
        threads1.start();
    }
}
class Threads extends Thread
{
    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("CALCY"))
        {
            calcy();
        }
        else {
            show();
        }
    }
    public void show()
    {
        for (int i = 0; i <5 ; i++) {
            System.out.println("Ayush");
        }
    }
    public void calcy()
    {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        System.out.println(x+y);
    }
}