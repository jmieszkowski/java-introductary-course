package my_package.exception.network_exercise;

import java.util.Random;

public class SocketExchange {

    private static Random random = new Random();

    public SocketExchange() throws ReadDataException, StockExchangeCreationException {

    }


    public void readData() throws ReadDataException {
        if ((random.nextInt()) % 2 == 1) {
            throw new ReadDataException();
        } else {
            System.out.println("reading Data");
        }
    }

    public void createStock() throws StockExchangeCreationException {
        if ((random.nextInt()) % 2 == 1) {
            throw new StockExchangeCreationException();
        } else {
            System.out.println("Creation stock");
        }
    }
}