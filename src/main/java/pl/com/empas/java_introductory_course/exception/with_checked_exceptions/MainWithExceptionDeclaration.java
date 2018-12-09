package pl.com.empas.java_introductory_course.exception.with_checked_exceptions;

import pl.com.empas.java_introductory_course.exception.my_exceptions.MyException;

public class MainWithExceptionDeclaration {

    public static void main(String[] args) throws MyException {
        Calculator calculator = new Calculator();
        System.out.println(calculator.addition(5, 3));
        System.out.println(calculator.subtraction(5, 3));
        System.out.println(calculator.multiplication(5, 3));
        System.out.println(calculator.division(5, 3));
        System.out.println(calculator.division(5, 0));
    }
}
