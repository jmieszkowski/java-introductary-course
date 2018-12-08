package data_type;

import java.sql.SQLOutput;

public class DataTypes {
    public static void main(String[] args) {

        byte d = 0;
        Byte dByte = 0;

        System.out.println("Max byte: " + Byte.MAX_VALUE);
        System.out.println("Max byte: " + Byte.MIN_VALUE);


        short c =0;
        Short cShort =0;

        System.out.println("Max short: " + Short.MAX_VALUE);
        System.out.println("Max short: " + Short.MIN_VALUE);

        int a = 5 + 8; //na tym nie możemy wykonywać metod bo jest to typ tzw. prymitywny, ale zajmuje mniej zasobów.
                       // primitive types
        Integer aInteger = 5 + 8; //na tym możemy używać metod, bo to obiekt

        System.out.println("Max int: " + Integer.MAX_VALUE);
        System.out.println("Max int: " + Integer.MIN_VALUE);



        long b = 5 + 8;
        Long bLong = 5l + 8l;

        System.out.println("Max long: " + Long.MAX_VALUE);
        System.out.println("Max long: " + Long.MIN_VALUE);



        float f = 3.11f; // 4 bajty
        Float fFloat = 3.11f;
        System.out.println("Max float: " + Float.MAX_VALUE);
        System.out.println("Min float: " + Float.MIN_VALUE);


        double db = 3.11; // 8 bajtów
        Double dbDouble = 3.11;

        System.out.println("Max double: " + Double.MAX_VALUE);
        System.out.println("Min double: " + Double.MIN_VALUE);

        boolean trueOrFalse = false;
        trueOrFalse = true;
        Boolean bBoolean = true;


        char littleChar = 'A';
        Character lCharacter = 'A';

        System.out.println("Max char: " + (int)Character.MAX_VALUE);
        System.out.println("Min char: " + (int)Character.MIN_VALUE);







    }
}
