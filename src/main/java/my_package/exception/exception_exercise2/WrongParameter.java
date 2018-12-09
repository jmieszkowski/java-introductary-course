package my_package.exception.exception_exercise2;

public class WrongParameter extends Exception{

    public WrongParameter(){
        //
    }
    public WrongParameter(String message){
        super(message);
    }
    public WrongParameter(String message, Throwable cause){
        super(message, cause);
    }
}
