package exception.network_exercise;

public class StockExchangeCreationException extends RuntimeException{
    public StockExchangeCreationException(){

    }
    public StockExchangeCreationException(String message){
        super(message);
    }
}
