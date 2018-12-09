package pl.com.empas.java_introductory_course.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ThreadpoolRaceExample {

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

        //sposób na stworzenie instancji klasy anonimowej w Java 8 przy pomocy lamdy
        // zapis () -> oznacza "dla zerowej liczby parametrow"
        // po znaku -> wstawiamy ciało metody run
        Runnable unsyncedExample = () -> {
            for (int i = 0; i < 10000000; i++)
                variable++;
        };

        //tworzymy pulę wątków o stałej liczbie - 4
        ExecutorService threadPool = Executors.newFixedThreadPool(4);

        //Klasa Future zawiera wynik działania wątku
        //W naszym przypadku nasze zadania nie zwracają wyników,
        //ale klasa future dostarczy nam informacji o tym, kiedy wątek się zakończył
        List<Future> syncedFutures = new ArrayList<>();
        for(int i = 0; i < 4; i++) {
            //metoda submit rozpoczyna działanie zadania na puli wątków i zwraca
            //obiekt klasy Future. Ten obiekt należy traktować jako kontener" na
            //wynik, który zostanie zwrócony w przyszłości.
            syncedFutures.add(threadPool.submit(syncedExample));
        }

        //Dopoki wszystkie watki sie nie zakoncza, w petli czekamy po sekundzie
        while(!syncedFutures.stream().allMatch(Future::isDone)) {
            Thread.sleep(1000);
        }
        System.out.println("syncedExample: " + getSyncedVariable());

        List<Future> unsyncedFutures = new ArrayList<>();
        for(int i = 0; i < 4; i++) {
            unsyncedFutures.add(threadPool.submit(unsyncedExample));
        }
        while(!unsyncedFutures.stream().allMatch(Future::isDone)) {
            Thread.sleep(1000);
        }
        System.out.println("unsyncedExample: " + variable);

    }
}
