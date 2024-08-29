package MultiThreading;

public class RunnableInterface {

    public static void main(String[] args) {

        ThreadGroup threadGroup = new ThreadGroup("Workers");

        Runnable w1 = new Worker1();
        Thread t1 = new Thread(w1);
        t1.start();

        Runnable w2 = new Worker1();
        Thread t2 = new Thread(w2);
        t2.start();



        for(int i =0; i < 10; i++)
        {
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

//Thread by interface
class Worker1 implements Runnable{



    @Override

    public void run()
    {
        for(int i =0; i<10; i++)
        {
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}