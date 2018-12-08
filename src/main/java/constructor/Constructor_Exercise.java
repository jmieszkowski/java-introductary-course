package constructor;

public class Constructor_Exercise {
    private Constructor_Exercise(){
        System.out.println("Default Constructor");
    }

    private Constructor_Exercise(String something){
        System.out.println(something + "     This is second constructor");
    }

    public static Constructor_Exercise firstConstructor(){

        return new Constructor_Exercise();


    }
    public static Constructor_Exercise secondContructor(String something){
        return new Constructor_Exercise(something);
    }
}
