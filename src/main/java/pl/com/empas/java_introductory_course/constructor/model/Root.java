package pl.com.empas.java_introductory_course.constructor.model;

public class Root {

    static {
        System.out.println("Static block in Root");
    }

    {
        System.out.println("Root's init block");
    }

    public Root() {
        System.out.println("Root's constructor");
    }
}
