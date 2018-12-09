package my_package.computers;

public class Main {

    public static void main(String[] args) {
        Computer laptop = new Laptop();
        Computer pc = new PC();
        Computer mainframe = new Mainframe();

        laptop.changeDrive();
        pc.changeDrive();
        mainframe.changeDrive();

        System.out.println();

        printName(laptop);
        printName(pc);
        printName(mainframe);




    }
    public static void printName(Computer computer){

        System.out.println("Your computer name: " + computer);
        Computer.print();


    }
}
