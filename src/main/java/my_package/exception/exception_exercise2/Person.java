package my_package.exception.exception_exercise2;

public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) throws WrongParameter{
        if(name == null || name.equals("")) {
            throw new WrongParameter("Wrong name!");
        } else {
            this.name = name;
        }

        if(surname == null || surname.equals("")) {
            throw new WrongParameter("Wrong surname!");

        } else{
            this.surname = surname;
        }

        if (age <= 0){
            throw new WrongParameter("Wrong age!");
        } else{
            this.age = age;
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
