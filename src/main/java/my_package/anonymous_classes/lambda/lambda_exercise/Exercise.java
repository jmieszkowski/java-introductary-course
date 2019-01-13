package my_package.anonymous_classes.lambda.lambda_exercise;
@FunctionalInterface
public interface Exercise {
    void swim();

    default void jogging(){};

}
