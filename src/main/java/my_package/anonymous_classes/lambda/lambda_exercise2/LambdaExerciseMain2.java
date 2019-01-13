package my_package.anonymous_classes.lambda.lambda_exercise2;

public class LambdaExerciseMain2 {
    public static void main(String[] args) {
        Singing singing = ()->{System.out.println("Alt singingngngnngngngng");};

        Singing singing1 = new Singing() {
            @Override
            public void alt() {

            }
            @Override
            public void sopran(){
                System.out.println("sopran override");
            }

        };

            singing1.sopran();
    }

    private static Singing createSinging(){

        return ()->{};
    }
}
