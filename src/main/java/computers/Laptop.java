package computers;

public class Laptop extends Computer {
    @Override
    public void changeDrive(){
        System.out.println("Disk in your laptop was replaced!");


    }

    @Override
    public String toString() {
        return "Laptop";
    }

    public static void print(){
        System.out.println("Helo from Laptop");
    }
}
