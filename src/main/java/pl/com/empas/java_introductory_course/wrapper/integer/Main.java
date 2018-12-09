package pl.com.empas.java_introductory_course.wrapper.integer;

public class Main {

    public static void main(String[] args) {
        IntWrapper wrapperForInt = new IntWrapper();
        System.out.println(wrapperForInt.getMaybe0());

        wrapperForInt = new IntWrapper(0);
        System.out.println(wrapperForInt.getMaybe0());
    }
}
