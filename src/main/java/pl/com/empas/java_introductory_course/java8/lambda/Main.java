package pl.com.empas.java_introductory_course.java8.lambda;

public class Main {

    public static void main(String[] args) {
        Thread worker = new Thread(new Job());
        worker.start();

        Runnable newJob = new Runnable() {
            @Override
            public void run() {
                System.out.println("Another job...");
            }

            public void print() {
                System.out.println("ok");
            }
        };

        new String("Ala").length();
        new Runnable() {
            @Override
            public void run() {
                System.out.println("Another job...");
            }

            public void print() {
                System.out.println("ok");
            }
        }.print();

        Runnable anotherJob = () -> {
            System.out.println("Another");
        };


    }
}
