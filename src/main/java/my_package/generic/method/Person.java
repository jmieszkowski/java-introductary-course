package my_package.generic.method;

public class Person {
    private String name;
    private String surname;
    private Integer age;


    public Person(String name, String surname, Integer age) {
        validate(name,surname,age);

        this.name = name;
        this.surname = surname;
        this.age = age;


    }

    private <T> void validate(T value1, T value2, T value3){
        if(null == value1 || null == value2 || null == value3){
            throw new IllegalArgumentException();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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






