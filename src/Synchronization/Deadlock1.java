package Synchronization;

//Deadlock in Java is a part of multithreading. Deadlock can occur in a situation when a thread is waiting for an object lock, that is acquired by another thread and second thread is waiting for an object lock that is acquired by first thread.
// Since, both threads are waiting for each other to release the lock, the condition is called deadlock.

public class Deadlock1 {
    public static void main(String[] args) {
        final String resource1 = "ratan Jaiswal";
        final String resource2 = "Vimal Jaiswal";

        Thread t1 = new Thread() {
            ;

            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread1: Locked resource1");

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }


                    synchronized (resource2) {
                        System.out.println("Thread1: Locked resource2");


                    }
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                synchronized (resource2) {
                    System.out.println("Thread2: Locked resource2");

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }


                    synchronized (resource1) {
                        System.out.println("Thread2: Locked resource1");


                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}

