package pl.com.empas.java_introductory_course.polymorphism.array.covariance;

public class ArrayIsObject {

    public static void main(String[] args) {
        Object stringsArray = new String[4];
        System.out.println(stringsArray);

        Object o = new Object();
        System.out.println(o);
    }
}
