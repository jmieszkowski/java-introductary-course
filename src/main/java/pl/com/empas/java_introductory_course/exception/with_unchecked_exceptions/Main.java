package pl.com.empas.java_introductory_course.exception.with_unchecked_exceptions;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.addition(5, 3));
        System.out.println(calculator.subtraction(5, 3));
        System.out.println(calculator.multiplication(5, 3));
        System.out.println(calculator.division(5, 3));
        System.out.println(calculator.division(5, 0));
    }
}
