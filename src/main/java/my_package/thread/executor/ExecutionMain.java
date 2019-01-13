package my_package.thread.executor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutionMain {
    public static void main(String[] args) {


        Runnable job = () -> {

            for(int i =0; i < 100; i++){
                System.out.println(String.format("i = [%d], run by: [%s]", i, Thread.currentThread().getName()));
            }
        };
        ExecutorService executor = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 100; i++) {
            executor.execute(job);
            }
        ExecutorService terminators = Executors.newFixedThreadPool(4);

        executor.shutdown();
        for (int i =0; i < 100; i++){
            terminators.execute(job);
        }
        terminators.shutdown();



        }
}
