package pl.com.empas.java_introductory_course.generics.validators;

public class PositiveIntegerValidator implements Validator<Integer>{

    @Override
    public boolean validate(Integer value) {
        return value > 0;
    }

    public static void main(String [] args) {
        Validator<Integer> validator = new PositiveIntegerValidator();
        System.out.println("Validate {3}: " + validator.validate(3));
        System.out.println("Validate {4987}: " + validator.validate(Integer.valueOf(4987)));
        System.out.println("Validate {0}: " + validator.validate(0));
        System.out.println("Validate {-123}: " + validator.validate(-123));
        //Compile error: double extends number, but we did enclose bounds to integer
        //System.out.println("Validate {-123.0}: " + validator.validate(-123.0));

    }


}
