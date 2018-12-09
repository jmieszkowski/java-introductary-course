package pl.com.empas.java_introductory_course.threads;

public class OneThreadExample {

    public static class MyThread extends Thread {

        public MyThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            for(int i = 0; i < 100; i++) {
                System.out.println(this.getName() + ": " +i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {

        MyThread myThread1 = new MyThread("Wątek 1");
        MyThread myThread2 = new MyThread("Wątek 2");
        myThread1.start();
        myThread2.start();

    }
}
