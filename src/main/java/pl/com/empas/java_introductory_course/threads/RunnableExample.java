package pl.com.empas.java_introductory_course.threads;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class RunnableExample implements Runnable {

    String name;

    public RunnableExample(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for(int i = 100; i > 0; i--) {
            System.out.println(name + ": " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Runnable runnable1 = new RunnableExample("Runnable 1");
        Runnable runnable2 = new RunnableExample("Runnable 2");
        Runnable runnable3 = new RunnableExample("Runnable 3");
        Runnable runnable4 = new RunnableExample("Runnable 4");
        Executor e = Executors.newFixedThreadPool(2);

        e.execute(runnable1);
        e.execute(runnable2);
        e.execute(runnable3);
        e.execute(runnable4);
    }
}
