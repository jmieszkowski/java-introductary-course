package my_package.conditional;

public class ConditionalsTest {
    public static void main(String[] args) {

//    testAge(10);

        printStringLength("Mieszkowski");
        testStringLength(null);
        

    }


    public static void testAge(int age) {
        if (age < 11) {
            System.out.println("Too young");
        } else if (age <= 15) {
            System.out.println("almost");
        } else if (age <= 18) {
            System.out.println("almost,almost");
        } else {
            System.out.println("ok!");
        }

    }

    public static void printStringLength(String string) {

        if (string != null) {
            int stringLen = string.length();
            System.out.println("String length: " + stringLen);


        } else {
            System.out.println("null is not allowed here!!");
        }


    }

    public static void testStringLength(String string) {
        if (null != string && string.length() < 10) {

            System.out.println("Quite short string");
        }

    }
}
