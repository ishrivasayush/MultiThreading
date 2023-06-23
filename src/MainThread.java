public class MainThread {
    public static void main(String[] args) {
        System.out.println("Main Thread !!");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        System.out.println("After Thread Execution");
        Thread.currentThread().setName("Ayush");
        Thread.currentThread().setPriority(7);
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}
