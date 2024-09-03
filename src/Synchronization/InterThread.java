package Synchronization;
//Inter-thread communication or Co-operation is all about allowing synchronized threads to communicate with each other.

//Cooperation (Inter-thread communication) is a mechanism in which a thread is paused running in its critical section and another thread is allowed to enter (or lock) in the same critical section to be executed.
// It is implemented by following methods of Object class:

//wait()
//notify()
//notifyAll()
class Customer{
    int amount = 10000;

    synchronized void withdraw(int amount)
    {
        System.out.println("going to withdraw...");

        if(this.amount < amount) {
            System.out.println("Less balance; waiting for deposit....");

            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
           this.amount-= amount;
            System.out.println("withdraw completed...");


    }

        synchronized void deposit(int amount)
        {
        System.out.println("going to deposit");
        this.amount+=amount;
        System.out.println("deposit completed");
        notify();
        }

    }

public class InterThread {
    public static void main(String[] args) {
        final Customer c = new Customer();
        new Thread(){
            public void run()
            {
              c.withdraw(15000);
            }
        }.start();

        new Thread(){
            public void run()
            {
                c.deposit(15000);
            }
        }.start();

    }
}
