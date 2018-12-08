package computers;

public class Computer {

    public void changeDrive(){
        System.out.println("Disk in your computer was replaced!");
    }

    public static void printName(Computer computer){
        System.out.println("Your computer name: " + computer);
    }

    public static void print(){

        System.out.println("Hello from Computer");
    }
}
