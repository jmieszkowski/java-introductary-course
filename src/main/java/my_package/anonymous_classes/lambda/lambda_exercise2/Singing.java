package my_package.anonymous_classes.lambda.lambda_exercise2;
@FunctionalInterface
public interface Singing {
    void alt();
    default void sopran(){
        System.out.println("sopran singing");
    }
    default void tenor(){
        System.out.println("tenor singing");
    }
}
