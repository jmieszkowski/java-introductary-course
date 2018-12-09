package pl.com.empas.java_introductory_course.recursion;

public class RecursionExample {

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(sumElementsWithIteration(intArray));
        System.out.println(sumElementsWithRecursion(intArray, intArray.length - 1));
    }

    public static int sumElementsWithRecursion(int[] array, int indexOfLastElements) {
        if (indexOfLastElements > 0) {
            return array[indexOfLastElements] + sumElementsWithRecursion(array, indexOfLastElements - 1);
        }

        return array[0];
    }

    public static int sumElementsWithIteration(int[] array) {
        int result = 0;

        for (int i : array) {
            result += i;
        }

        return result;
    }
}
