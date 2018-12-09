package pl.com.empas.java_introductory_course.quiz;

public class JSHackTest {

    public static void main(String [] args) {
       A a = new A();
        System.out.println(a.equals(1) && a.equals(2) && a.equals(3));

    }

    static class A {
        int num = 0;

        @Override
        public int hashCode() {
            return num;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || Integer.class != o.getClass()) return false;

            Integer a = (Integer) o;

            return ++num == a;
        }
    }
}
