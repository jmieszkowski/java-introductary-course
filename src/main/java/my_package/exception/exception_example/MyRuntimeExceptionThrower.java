package my_package.exception.exception_example;

public class MyRuntimeExceptionThrower {

    public void throwMyRuntimeException (){
        System.out.println("throwMyRuntimeException()");
        throw new MyRuntimeException("heheheheh");
    }
}
