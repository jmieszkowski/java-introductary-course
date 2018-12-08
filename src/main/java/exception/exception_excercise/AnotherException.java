package exception.exception_excercise;

public class AnotherException extends Exception{
    public void anotherExecption() throws Exception{
        ExceptionExerciseThrower thrower = new ExceptionExerciseThrower();
        thrower.throwException();
    }
}
