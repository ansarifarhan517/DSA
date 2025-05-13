package Multithreading;

public class test extends Thread {

    test(String threadName) {
        super(threadName);
    }

    @Override
    public void run() {
        // for (;;) {
        // System.out.println(Thread.currentThread().getName() + "is Running");
        // }
        try {
            Thread.currentThread().sleep(10000);
            System.out.println(Thread.currentThread().getName() + " Running");
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        test t1 = new test("Thread1");
        test t2 = new test("Thread2");
        t1.start();
        t2.start();
        System.out.println("Main THread");
    }
}
