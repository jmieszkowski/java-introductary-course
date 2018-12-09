package my_package.computers;

public class Mainframe extends Computer {
    @Override
    public void changeDrive(){
        System.out.println("Disk in your mainframe was replaced!");


    }

    @Override
    public String toString() {
        return "Mainframe";
    }

    public static void print(){
        System.out.println("Hello from Mainframe");
    }
}
