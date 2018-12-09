package my_package.anonymous_classes.lambda;

public class MyLambdaMain {
    public static void main(String[] args) {
        MyLambda lambda = (n, word) -> {
            for (int i=0; i<n; i++){
                word += word;
            }
            return word;
        };

        System.out.println(lambda.test(10,"JAVA"));


        FlyableCleaner cleaner = new FlyableCleaner();

        cleaner.clean(() -> System.out.println("Cleaningggggggggggggggg"));

        cleaner.extraCleaning(()->{});

        SwimableCleaner cleaner2 = new SwimableCleaner();
        cleaner2.swimCleaner((distance,speed)-> {});

        MyLambda lambda1 = (n,word) -> {return word;};





    }

}
