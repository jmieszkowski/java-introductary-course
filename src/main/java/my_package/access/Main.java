package my_package.access;

public class Main {
    public static void main(String[] args) {
        Person jedrek = new Person("Jędrek", "M", -20);

        System.out.println(jedrek);

        jedrek.secret = "my secret";
        jedrek.secondSecret = "second secret";




    }
}
