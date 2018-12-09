package my_package.max;

import java.util.Scanner;

public class MaxSearch {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        System.out.println("Input values: ");
        int a = inputReader.nextInt();
        int b = inputReader.nextInt();
        int c = inputReader.nextInt();
        int d = inputReader.nextInt();

        System.out.println("Maximum value: " + findMax(a,b,c,d));

        System.out.println("Minimum value: " + findMin(a,b,c,d));

    }

    public static int findMax(int d, int e, int f, int g) {
        int max = d;

        if (e > max) {
            max = e;
        }

        if(f > max){
            max =f;
        }
        if(g > max){
            max =g;
        }


        return max;

    }

    public static int findMin(int d, int e, int f, int g){
        int min = d;

        if(e < min){
            min = e;
        }
        if(f < min){
            min = f;
        }
        if(g < min){
            min = g;
        }
        return min;
    }
}
