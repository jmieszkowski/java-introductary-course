package my_package.exception.exception_exercise2;

public class PersonMain {
    public static void main(String[] args) {
//        Person person1 = null;
//        try {
//             person1 = new Person("Jędrek", "M",10);
//        } catch (WrongParameter wrongParameter) {
//            wrongParameter.printStackTrace();
//        }
        Person2 personIlligal;
        try{
            personIlligal = new Person2("Name", "");
        }catch (IllegalArgumentException exc){
            exc.printStackTrace();
        }
    }
}
