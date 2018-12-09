package pl.com.empas.java_introductory_course.threads;

public class SimpleWaitAndNotify {
    final static Object object = new Object();

    public static void main(String[] args) {
        Thread myThread = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Trying to notify others...");
            synchronized (object) {
                object.notify();
            }
        });
        myThread.start();

        Thread myThread2 = new Thread(() -> {
            synchronized (object) {
                try {
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Finishing from Thread2");
        });
        myThread2.start();

        try {
            synchronized (object) {
                object.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Finishing....");
    }
}
