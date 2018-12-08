package object;

public class Person {

    public static int numberOfPerson = 0;

    private String name;
    private String surname;
    private int age;

    public Person(){
        // empty
        numberOfPerson++;
    }

    public Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
        numberOfPerson++;
    }

public Person(String name, int age){
        this.name = name;
        this.age=age;
        surname = "brak";
        numberOfPerson++;
}


    public void introducePerson(){

        System.out.println("Hello, I`m: " + name + " " + surname + "  I am " + age + " years old");

    }

    public static void somethingAboutPerson(){
        System.out.println("All people like maths!!!");
    }

    public static void printNumberOfPerson(){

        System.out.println("Number of person: " + numberOfPerson);
    }


}
