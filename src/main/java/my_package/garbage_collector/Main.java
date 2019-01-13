package my_package.garbage_collector;

public class Main {
    public static void main(String[] args) {
        Object o = makeObject();
        empty();
        {
            Object a = new Object();
        }



    }

    public static Object makeObject(){
        String temporal = new String("lost one");
        return new String("new String");
    }
    public static void empty(){
        //empty
    }

}
