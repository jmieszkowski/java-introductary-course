package my_package.garbage_collector;

public class StackOverflowExample {
    public static void main(String[] args) {
//        callMe();
        one();
    }


    public static void callMe(){
        callMe();
    }

    public static void one(){
        two();
    }

    private static void two() {
        one();
    }

}
