package pl.com.empas.java_introductory_course.constructor.model;

public class RootGrandson extends RootChild {

    static {
        System.out.println("RootGrandson static block");
    }

    {
        System.out.println("RootGrandson 1st init block");
    }

    {
        System.out.println("RootGrandson 2nd init block");
    }

    public RootGrandson() {
        System.out.println("RootGrandson constructor");
    }
}
