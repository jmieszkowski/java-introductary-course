package exception.network_exercise;

public class NetworkMain {
    public static void main(String[] args) {
        try {
            SocketExchange o = new SocketExchange();
            o.createStock();
            o.readData();
        } catch (ReadDataException e){ e.printStackTrace();
        } finally {
            System.out.println("finally");
        }



    }
}
