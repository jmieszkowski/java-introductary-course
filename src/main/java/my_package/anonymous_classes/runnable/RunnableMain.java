package my_package.anonymous_classes.runnable;

public class RunnableMain {
    public static void main(String[] args) {

        Runnable object1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Object1");
            }
        };



        Runnable lambdaRunnable = () ->{
            System.out.println("lambdaRunnable");
        };

        RunnableTest runnableTest = new RunnableTest();

        runnableTest.run();

        processRunnable(object1);
        processRunnable(lambdaRunnable);
        processRunnable(new Runnable() {
            @Override
            public void run() {
                System.out.println("parameter class");
            }
        });
        processRunnable(()->{
            System.out.println("Lambda Runnable");
        });

    }

    public static void processRunnable(Runnable runnable){
        System.out.println();
        System.out.println("processRunnable()");
        runnable.run();
        System.out.println();
    }
}
