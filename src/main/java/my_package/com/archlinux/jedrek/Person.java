package my_package.com.archlinux.jedrek;

public class Person {

    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        setSurname(surname);
        this.age = age;

    }

    public Person(String name) {
        this.name = name;
        this.surname = "Anonim";
        this.age = -1;


    }

    public static void main(String[] args) {

        Person jedrek = new Person("Jedrek", "MieszkowskiMIeszkowski", 21);
        Person kamil = new Person("Kamil", "Słaby", 21);

        kamil.setAge(-1);
        jedrek.setAge(20);

        Person you = new Person("Jedrek");

        you.setAge(55);

        System.out.println(jedrek);
        System.out.println(kamil);
        System.out.println(you);


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname.length() > 20) {

            System.out.println("To many letters in surname");
            this.surname = surname.substring(0, 20);


        } else {
            this.surname = surname;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age < 0 || age > 200) {

            this.age = 0;
            System.out.println(name + "! Incorrect age!!");
            return;
        } else {

            this.age = age;
            System.out.println(name + "! Correct Age!!");
            return;
        }

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';


    }
}
