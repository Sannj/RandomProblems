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
                    System.out.println("myThread1 - id" + myID + " : " + i);
                } catch (InterruptedException e) {

                }
            }
        }
    }

    static class myThread2 implements Runnable {
        int myID;

        myThread2(int id) {
            myID = id;
        }

        public void run() {
            for (int i = 1; i < 5; i++) {
                try {
                    Thread.sleep((int) (Math.random() * 500));
                } catch (InterruptedException e) {
                    System.out.println("myThread2 - id" + myID + " : " + i*i);
                }
            }
        }
    }

}
