package exception.exception_example;

public class TestMyRuntimeException {
    public static void main(String[] args) {
        try{throw new MyRuntimeException();}
        catch(MyRuntimeException e){
            e.printStackTrace();
        }

    }
}
