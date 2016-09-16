package RandomProblems;

/**
 * Created by sanjanabadam on 9/16/16.
 */
public class ThreadProgram {
    public static void main(String[] args) {
        Thread t1 = new myThread1(1);
        Thread t2 = new Thread(new myThread1(2));
        Thread t3 = new Thread(new myThread2(3));
        Thread t4 = new Thread(new myThread2(4));
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(3);
        t3.setPriority(Thread.NORM_PRIORITY);
        t4.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

    static class myThread1 extends Thread {

        int myID;

        myThread1(int id) {
            myID = id;
        }

        public void run() {
            for (int i = 1; i < 5; i++) {
                int second = (int) (Math.random() * 500);
                try {
                    Thread.sleep(second);
                } catch (InterruptedException e) { }
                System.out.println("myThread1 - id" + myID + " : " + i);
                System.out.println("my priority is "+getPriority());
            }
        }
    }

    static class myThread2 extends Thread{
        int myID;

        myThread2(int id) {
            myID = id;
        }

        public void run() {
            for (int i = 1; i < 5; i++) {
                try {
                    Thread.sleep((int) (Math.random() * 500));
                } catch (InterruptedException e) {

                }
                System.out.println("myThread2 - id" + myID + " : " + i*i);
                System.out.println("my priority is "+ getPriority());
            }
        }
    }

}
