public class MyThread {
    public static void main(String[] args) {
        System.out.println("Main");
        MyThreadClass myThreadClass=new MyThreadClass();
        myThreadClass.start();
    }
}
class MyThreadClass extends Thread{
    @Override
    public void run() {
        System.out.println("Child Thread !!");
    }

}