package exception.exception_exercise2;

import exception.exception_example.MyRuntimeException;

public class RuntimeExceptionMain {
    public static void main(String[] args) {
        try {
            level1();
        }catch(MyRuntimeException e){
            e.printStackTrace();
        }
    }
    public static void level1(){
        level2();
    }
    public static void level2(){
        level3();
    }

    public static void level3() throws MyRuntimeException{
        throw new MyRuntimeException("My runtime exception error");
    }

}
