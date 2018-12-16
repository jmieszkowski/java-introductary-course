package my_package.thread;

import java.util.ArrayList;
import java.util.List;

public class ThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        Runnable job = () -> System.out.println("Worker name: " + Thread.currentThread().getName());

        Thread worker = new Thread(job);
        worker.setName("worker");
        worker.run();
        worker.start();
        MyWorker myWorker = new MyWorker("MyWorker", job, worker);
        myWorker.start();

        Thread indian = new Thread(job);
        indian.setName("indian");
        indian.start();

        try {
            indian.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<String> strings = new ArrayList<>();
        Runnable addingString = () -> {
            synchronized (strings){
            strings.add(Thread.currentThread().getName());
            }
        };

        Thread one = new Thread(addingString);
        Thread two = new Thread(addingString);
        Thread three = new Thread(addingString);
        Thread four = new Thread(addingString);

        one.start();
        two.start();
        three.start();
        four.start();

        System.out.println(strings);
        System.out.println("End of main");


    }
}
