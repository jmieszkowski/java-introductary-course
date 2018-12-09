package my_package.exception.exception_example;

public class MyExceptionThrower {
    public void throwMyException() throws MyException {
        System.out.println("throwMyException");
        throw new MyException("hahahaha");
    }
}
