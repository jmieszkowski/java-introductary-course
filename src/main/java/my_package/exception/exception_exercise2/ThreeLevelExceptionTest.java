package my_package.exception.exception_exercise2;

import my_package.exception.my_new_exception.MyNewException;
import pl.com.empas.java_introductory_course.exception.my_exceptions.MyException;

public class ThreeLevelExceptionTest {
    static int counter = 1;

    public static void main(String[] args) throws MyException {
        System.out.println("main()");
        level1();
        System.out.println("main after level1()");


    }

    public static int level1() throws MyException {
        System.out.println("level2()");
        try {
            level2();
        } catch (MyException e) {
            e.printStackTrace();
        }
        return 1;
    }

    public static int level2() throws MyException {
        System.out.println("level2()");
        try {
            level3();
            System.out.println("level 2() try");
        } catch (MyNewException e) {
            e.printStackTrace();
        } catch (MyException e){e.printStackTrace();}
        System.out.println("level2() - before return");
        return 2;
    }

    public static int level3() throws MyException, MyNewException {
        System.out.println("level3()");
        if (counter % 2 == 1) {
            throw new MyException("Problem on level 3");
        } else if (counter == 4) {throw new MyNewException();}

        System.out.println("level3() after Exception");
        return 3;

    }
}
