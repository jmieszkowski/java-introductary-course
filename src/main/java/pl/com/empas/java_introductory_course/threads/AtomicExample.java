package pl.com.empas.java_introductory_course.threads;

import java.util.concurrent.atomic.AtomicLong;

public class AtomicExample {

    static AtomicLong variable = new AtomicLong(0);

    public static void main(String[] args) throws InterruptedException {

        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++)
                    variable.getAndIncrement();
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        Thread t4 = new Thread(r);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        System.out.println(variable.get());
    }
}
