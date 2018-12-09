package pl.com.empas.java_introductory_course.polymorphism.interfaces.using_constants;

import pl.com.empas.java_introductory_course.polymorphism.interfaces.constant.MathConstants;

public class Main {

    public static void main(String[] args) {
        System.out.println(MathConstants.PI);
        System.out.println(MathConstants.E);
        System.out.println(MathConstants.CATALAN_CONSTANT);
        System.out.println(MathConstants.EULER_CONSTANT);

        // is it works?
//        MathConstant.CATALAN_CONSTANT = 0.0;
    }
}
