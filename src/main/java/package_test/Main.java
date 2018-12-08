package package_test;

public class Main {

    public static void main(String[] args) {
        package_test.one.Speaker one = new package_test.one.Speaker();
        package_test.two.Speaker two = new package_test.two.Speaker();
        package_test.three.Speaker three = new package_test.three.Speaker();




        one.speak();
        two.speak();
        three.speak();


    }

}
