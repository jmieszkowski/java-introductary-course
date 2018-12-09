package pl.com.empas.java_introductory_course.threads;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

class Consumer implements Runnable {
    private final Queue<Integer> consumerQueue;

    Consumer(Queue<Integer> consumerQueue) {
        this.consumerQueue = consumerQueue;
    }

    @Override
    public void run() {
        System.out.println(String.format("Consumer from thread:[%s]", Thread.currentThread().getName()));

        while (true) {
            synchronized (consumerQueue) {
                System.out.println(consumerQueue.poll());
                try {
                    consumerQueue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Producer implements Runnable {
    private final Queue<Integer> producerQueue;
    private final Random generator;

    Producer(Queue<Integer> producerQueue) {
        this.producerQueue = producerQueue;
        generator = new Random();
    }

    @Override
    public void run() {

        while (true) {
            int newNumber = generator.nextInt(100);
            System.out.println("Generating new number: " + newNumber);

            synchronized (producerQueue) {
                producerQueue.add(newNumber);
                producerQueue.notifyAll();
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class WaitAndNotifyExample {

    public static void main(String[] args) {
        Queue<Integer> secretNumbers = new LinkedList<>();

        Thread producerThread = new Thread(new Producer(secretNumbers));
        producerThread.start();

        Thread consumerThread = new Thread(new Consumer(secretNumbers));
        consumerThread.start();
    }
}
