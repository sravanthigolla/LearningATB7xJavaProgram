package MultiThreading;

public class Thread1 {
    public static void main(String[] args) throws InterruptedException {
//Thread is a class
        Thread t = Thread.currentThread();
        System.out.println(t);
        for(int i =0; i<10; i++)
        {
           // System.out.println(i+" - "+t.getName());
           // System.out.println(i+" - "+t.getPriority());

            System.out.println(t.getName() + i + "-"+t.getThreadGroup() + "-"+t.getPriority());
            Thread.sleep(5000);
        }
//1- low, 5-norm, 10-High priority

    }
}
