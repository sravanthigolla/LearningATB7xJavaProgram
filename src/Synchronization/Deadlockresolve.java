package Synchronization;
//To solve the issue we will have to simply re-order the statements where the code is accessing shared resources.
//A deadlock usually happens when one thread is waiting for the other to finish. In this case, we can use join with a maximum time that a thread will take.
public class Deadlockresolve {

    public static void main(String[] args) {

        Deadlockresolve test = new Deadlockresolve();

        final resource1 a = test.new resource1();
        final resource2 b = test.new resource2();

        Runnable b1 = new Runnable() {
            @Override
            public void run() {
                synchronized (b){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (a){
                        System.out.println("In block 1");
                    }

                }
            }
        };

        Runnable b2 = new Runnable() {
            @Override
            public void run() {
                synchronized (b){
                    synchronized (a){
                        System.out.println("In block 2");
                    }
                }

            }
        };

        new Thread(b1).start();
        new Thread(b2).start();

    }

    private class resource1{
        private int i =10;
        public int getI()
        {
            return i;
        }

        public void setI()
        {
            this.i = i;
        }


    }

    private class resource2{
        private int i =20;
        public int getI()
        {
            return i;
        }

        public void setI()
        {
            this.i = i;
        }


    }




}
