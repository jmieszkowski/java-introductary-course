package scanner;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner inputRead = new Scanner(System.in);
          System.out.println("Input a value: ");
//
//        int intValue1 = inputRead.nextInt();
//        int intValue2 = inputRead.nextInt();
//        int intValue3 = inputRead.nextInt();


        for (; inputRead.hasNext(); ) {
            if (inputRead.hasNextInt()) {
                System.out.println(inputRead.next());
                //System.out.println("Multiplied:   " + (intValue1 * intValue2 * intValue3));
            } else {
                System.out.println("Incorrect value");
                inputRead.next();

            }
        }
    }
}
