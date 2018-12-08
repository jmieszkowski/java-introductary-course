package loop;

public class ForTest {
    public static void main(String[] args) {
        printNTimes(1, "ala");
        printNTimes(10, "ala ma kota");

        printNTimes(5, "Jędrek");


    }

    public static void printNTimes(int numberOfTimes, String valueToPrint) {

        for (int i = 0; i < numberOfTimes; i++) {

            System.out.println(valueToPrint);
        }

    }

    public static void printName(int numberTimes, String name) {

        for (int i = 0; i < numberTimes; i++) {

            System.out.println(name);
        }
    }
}
