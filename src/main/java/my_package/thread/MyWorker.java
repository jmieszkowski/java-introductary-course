package my_package.thread;

public class MyWorker extends Thread{

    private Runnable jobTodo;
    private Thread afterThis;


    public MyWorker(String name, Runnable jobTodo, Thread afterThis){
        super(jobTodo);
        setName(name);
        this.jobTodo = jobTodo;
        this.afterThis = afterThis;
    }

    @Override
    public synchronized void start(){
        try {
            afterThis.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        super.start();
    }

}
