package exception.exception_exercise2;

public class Person2 {
    private String name;
    private String surname;
    public Person2(String name, String surname){
        if(name == null || name.equals("")) {
            throw new IllegalArgumentException();
        } else {
            this.name = name;
        }

        if(surname == null || surname.equals("")) {
            throw new IllegalArgumentException();
        } else{
            this.surname = surname;
        }
    }
}
