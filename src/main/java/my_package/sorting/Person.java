package my_package.sorting;

public class Person  implements Comparable<Person>{
    private String name;
    private String surname;
    private int age;
    private int iq;
    private double income;
    private double height;
    private double shoeSize;

    public Person(String name, String surname, int age, int iq, double income, double height, double shoeSize) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.iq = iq;
        this.income = income;
        this.height = height;
        this.shoeSize = shoeSize;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getIq() {
        return iq;
    }

    public double getIncome() {
        return income;
    }

    public double getHeight() {
        return height;
    }

    public double getShoeSize() {
        return shoeSize;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", iq=" + iq +
                ", income=" + income +
                ", height=" + height +
                ", shoeSize=" + shoeSize +
                '}';
    }

    @Override
    public int compareTo(Person person) {
        return person.iq - iq;
        }
}
