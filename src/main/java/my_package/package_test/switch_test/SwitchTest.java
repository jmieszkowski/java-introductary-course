package my_package.package_test.switch_test;

import my_package.enum_example.Days;

public class SwitchTest {
    public static void main(String[] args) {

        checkMark(4);
        final int a =5;
        changeInt(a);
        System.out.println(a);

        printDay(Days.MONDAY);



    }
    public static void checkMarkWithSwitch(int mark){
        switch (mark){
            case 6:
            case 5:
                System.out.println("Great!");
                break;
            case 4:
            case 3:
                System.out.println("good");
                break;
            default:
                System.out.println("wrrrr");
        }
    }

    public static void checkMark(int mark){
            if(mark ==6 || mark ==5){
                System.out.println("Bravo!");
            } else if(mark ==4){
                System.out.println("OK!");
            } else if(mark ==3 || mark ==2 ){
                System.out.println(":///////");
            } else if(mark ==1){
                System.out.println(":((((((((((((((((((");
            } else{
                System.out.println("There is no such mark!!");
            }

    }
    public static void changeInt(int a){
                a = 6;
        System.out.println("a inside method: " + a);

    }

    public static void printDay(Days currentDay){
        switch (currentDay){
            case MONDAY:
                System.out.println("monday");
                break;
            case THUSDAY:
                System.out.println("thusday");
                break;
        }
    }
}
