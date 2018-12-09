package pl.com.empas.java_introductory_course.polymorphism.casting;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle;

        Car car = new Car();

        Aeroplane plane = new Aeroplane();

        // up-casting is safe
        vehicle = car;
        vehicle.move();

        vehicle = plane;
        vehicle.move();

        // doesn't work
//        my_package.package_test.vehicle.fly();

        // down-casting
        Aeroplane anotherPlane = (Aeroplane) vehicle;
        anotherPlane.fly();

        castToAeroplane(vehicle);

        // thanks god it doesn't work
//        String string = (String) my_package.package_test.vehicle;

        // but...
        Object object = plane;
        // uncomment it on you own responsibility
//        castToString(my_package.object);
//        castToString(plane);
        saveCastToString(object);
    }

    public static void castToAeroplane(Vehicle vehicle) {
        System.out.println("castToAeroplane()");
        Aeroplane aeroplane = (Aeroplane) vehicle;
        aeroplane.fly();
    }

    public static void castToString(Object maybeString) {
        // boom
        String string = (String) maybeString;
        System.out.println("It's string: " + string);
    }

    public static void saveCastToString(Object maybeString) {
        System.out.println("saveCastToString()");

        if (maybeString instanceof String) {
            String string = (String) maybeString;
            System.out.println("It's string: " + string);

        } else {
            System.out.println("It's not String!!!");
        }
    }
}
