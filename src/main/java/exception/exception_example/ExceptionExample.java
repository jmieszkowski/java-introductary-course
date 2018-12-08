package exception.exception_example;

public class ExceptionExample {
    public static void main(String[] args) throws MyException {
        MyExceptionThrower myThrower = new MyExceptionThrower();

//        try {
            myThrower.throwMyException();
            System.out.println("here");
//        } catch (MyException e) {
//        e.printStackTrace();

//
//        }
    }

}
