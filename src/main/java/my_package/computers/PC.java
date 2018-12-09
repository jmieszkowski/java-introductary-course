package my_package.computers;

public class PC extends Computer {
    @Override
    public void changeDrive(){
        System.out.println("Disk in your PC was replaced!");

    }

    @Override
    public String toString() {
        return "PC";
    }

    public static void print(){
        System.out.println("Hello from Computer");
    }
}

