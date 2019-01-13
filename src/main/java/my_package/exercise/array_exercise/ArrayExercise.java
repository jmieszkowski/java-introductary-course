package my_package.exercise.array_exercise;

public class ArrayExercise {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        Integer[] arrayOfIntegers = {1, 2, 3,};

        Object[] objects = arrayOfIntegers;

        System.out.println(objects.length);

        Object o = array;

        System.out.println(objects.toString());

        Anonymous anonymous = new Anonymous();
        System.out.println(anonymous.toString());

    }




}
class Anonymous {
}
