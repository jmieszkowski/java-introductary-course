package pl.com.empas.java_introductory_course.threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Job implements Runnable {
    private final Object resourceA, resourceB;

    Job(Object resourceA, Object resourceB) {
        this.resourceA = resourceA;
        this.resourceB = resourceB;
    }

    @Override
    public void run() {
        while (true) {
            String threadName = Thread.currentThread().getName();
            System.out.println(String.format("Job run by thread: [%s]", threadName));

            System.out.println(String.format("Trying to synchronized on first resource by thread [%s]", threadName));
            synchronized (resourceA) {
                System.out.println(String.format("First resource acquired by thread [%s]", threadName));

                System.out.println(String.format("Trying to synchronized on second resource by thread [%s]", threadName));
                synchronized (resourceB) {
                    System.out.println(String.format("Second resource acquired by thread [%s]", threadName));

                    System.out.println(String.format("Working... on thread [%s]", threadName));
                }
            }

            System.out.println(String.format("Releasing all resources by thread [%s]", threadName));
        }
    }
}

public class ThreadLockExample {

    public static void main(String[] args) {
        Object resourceOne = new Object(), resourceTwo = new Object();

        Job firstJob = new Job(resourceOne, resourceTwo);
        Job secondJob = new Job(resourceOne, resourceTwo);
        // always acquire resources in the same order
//        Job secondJob = new Job(resourceTwo, resourceOne);

        new Thread(firstJob, "Donald").start();
        new Thread(secondJob, "Jarosław").start();
    }
}
