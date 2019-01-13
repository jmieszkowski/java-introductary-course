package my_package.anonymous_classes.runnable;

public class FabricExample {
    public static void main(String[] args) {

        MyRunnable one = new MyRunnable();
        one.run();

        MyRunnable two = new MyRunnable();
        two.run();

        makeNewRunnable();
        makeNewRunnable();



    }

    private static Runnable makeNewRunnable(){
        return new Runnable() {
            private String name = "Jędrek";
            @Override
            public void run() {
                String name = "Piotrek";
                System.out.println("My name: " + this.name + name);
            }
        };
    }

    private static Runnable makeLambdaRunnable(){
        return () -> {
            String name = "Jędrek";

            System.out.println("My name: " + name);
        };
    }
}

class MyRunnable implements Runnable{

    private String name = "Jędrek";


    @Override
    public void run() {
        System.out.println("My name: " + this.name);
    }
}

