package exception.exception_excercise;

public class ExceptionExerciseMain {
    public static void main(String[] args) throws Exception {

        AnotherException o = new AnotherException();
        try{
        o.anotherExecption();} catch (ExceptionExcercise e){
            e.printStackTrace();
        }
    }
}
