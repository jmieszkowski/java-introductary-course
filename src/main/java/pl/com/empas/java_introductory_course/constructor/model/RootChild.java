package pl.com.empas.java_introductory_course.constructor.model;

public class RootChild extends Root {

    static {
        System.out.println("RootChild static block");
    }

    {
        System.out.println("RootChild init block");
    }

    RootChild() {
        System.out.println("RootChild constructor");
    }
}
