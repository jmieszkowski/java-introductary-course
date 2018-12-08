package string_test;

public class StringTest {
    public static void main(String[] args) {

        String name = "Jędrekk"; // to jest dobra praktyka
        String theSame = name;
        String secondName = new String("Brak"); // to nie jest dobra praktyka,
        String surname = "Mieszkowski";

        System.out.println("Name: " + name);
        System.out.println("Second Name: "+ secondName);
        System.out.println("Surname: " + surname);
        System.out.println("Number of letters in surname: " + surname.length());

        System.out.println("Char at index 6: " + name.charAt(6));
        System.out.println("Char at index 1: " + name.charAt(1));

        System.out.println("Cutted surname: " + surname.substring(2));

        System.out.println("Cutted surname: " + surname.substring(3, 10));
        System.out.println("Replace: " + theSame.replace('k', 'o'));
        System.out.println("theSame: " + theSame);
        System.out.println("My name: " + name);



        System.out.println(5 + 6);
        System.out.println("5 + 6 " + (5 + 6));
        System.out.println(5 + 6 + " - 5 + 6");
        System.out.println("5 + 6 " + 5 + 6);
        System.out.println("J" + 7);
        System.out.println('J' + 7);






    }
}
