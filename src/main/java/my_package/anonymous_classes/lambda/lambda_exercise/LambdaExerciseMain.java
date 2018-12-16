package my_package.anonymous_classes.lambda.lambda_exercise;

public class LambdaExerciseMain {
    public static void main(String[] args) {
        Trainer trainer = new Trainer();
        Exercise job = new Exercise() {
            @Override
            public void swim() {
                System.out.println("swim");
            }
        };

        Exercise lambdaJob = () -> {};
        MyRunnable run = () -> {};

//        trainer.performExercise(job);
        trainer.performExercise(()-> System.out.println("swim"), ()-> System.out.println("run"));


    }

    private static Exercise makeNewExercise(){

        return new Exercise() {
            @Override
            public void swim() {
                System.out.println("my new exercise swim");
            }
        };
    }

    private static Exercise makeLambdaExercise(){

        return () -> {
            System.out.println("my new lambda exercise swim");
        };
    }
}
