package exception.exception_example;

public class ThrowLevel2 {
    public void doIt() throws MyException{
        System.out.println("Im dangerouse");

        MyExceptionThrower thrower = new MyExceptionThrower();
        thrower.throwMyException();
    }
}
