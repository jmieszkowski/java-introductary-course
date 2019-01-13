package my_package.thread.join;

public class JoinMain {
    public static void main(String[] args) {
        System.out.println("main() - beginning");


        Runnable job = () -> {

            for(int i =0; i < 100; i++){
                System.out.println(String.format("i = [%d], run by: [%s]", i, Thread.currentThread().getName()));
            }
        };

        Thread worker1 = new Thread(job);
        Thread worker2 = new Thread(job);
        Thread worker3 = new Thread(job);

        worker1.start();
        worker2.start();
        worker3.start();

        try {
            worker1.join();
            worker2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            worker3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // worker1.setDaemon(true);
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        System.out.println("main() - end");
    }
}
