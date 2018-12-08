package exception.network_exercise;

public class ReadDataException extends RuntimeException{
    public ReadDataException(String message){
        super(message);
    }
    public ReadDataException(){

    }
}
