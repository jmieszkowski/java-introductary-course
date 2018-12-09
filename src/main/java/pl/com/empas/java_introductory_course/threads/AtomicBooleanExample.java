package pl.com.empas.java_introductory_course.threads;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

class JobOne implements Runnable {

    private final AtomicBoolean shouldContinue;

    JobOne(AtomicBoolean shouldContinue) {
        this.shouldContinue = shouldContinue;
    }

    @Override
    public void run() {
        while (true == shouldContinue.get()) {
            try {
                System.out.println("Job 1");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class JobTwo implements Runnable {

    private final AtomicBoolean shouldContinue;

    JobTwo(AtomicBoolean shouldContinue) {
        this.shouldContinue = shouldContinue;
    }

    @Override
    public void run() {
        while (true == shouldContinue.get()) {
            try {
                System.out.println("Job 2");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class AtomicBooleanExample {

    public static void main(String[] args) {
        AtomicBoolean shouldContinue = new AtomicBoolean(true);
        Thread one = new Thread(new JobOne(shouldContinue));
        one.start();

        Thread two = new Thread(new JobTwo(shouldContinue));
        two.start();

        try {
            if (-1 != System.in.read()) {
                shouldContinue.set(false);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Finishing...");
    }
}
