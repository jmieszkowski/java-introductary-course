package pl.com.empas.java_introductory_course.threads;

public class RaceExample {

    static long syncedVariable = 0;
    static long variable = 0;
    static Object lock = new Object();

    public static synchronized long getSyncedVariable() {
        return syncedVariable;
    }

    public static synchronized void setSyncedVariable(long value) {
        syncedVariable = value;
    }

    public static void main(String[] args) throws InterruptedException {

        Runnable syncedExample = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000000; i++)
                    synchronized (lock) {
                        setSyncedVariable(getSyncedVariable() + 1);
                    }
            }
        };

        Runnable unsyncedExample = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000000; i++)
                    variable++;
            }
        };
        Thread t1 = new Thread(syncedExample);
        Thread t2 = new Thread(syncedExample);
        Thread t3 = new Thread(syncedExample);
        Thread t4 = new Thread(syncedExample);

        Thread t5 = new Thread(unsyncedExample);
        Thread t6 = new Thread(unsyncedExample);
        Thread t7 = new Thread(unsyncedExample);
        Thread t8 = new Thread(unsyncedExample);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        System.out.println("Synced example: " +getSyncedVariable());

        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t5.join();
        t6.join();
        t7.join();
        t8.join();

        System.out.println("UnSynced example: " +variable);
    }
}
