package pl.com.empas.java_introductory_course.exception.with_checked_exceptions;

import pl.com.empas.java_introductory_course.exception.my_exceptions.MyException;

public class Calculator {

    public double addition(double a, double b) {
        return a + b;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) throws MyException {
        if (0 == b) {
            throw new MyException("Cannot divide by 0!!!");
        }

        return a / b;
    }
}
