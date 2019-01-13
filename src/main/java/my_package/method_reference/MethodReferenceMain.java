package my_package.method_reference;

import java.util.List;

public class MethodReferenceMain {
    public static void main(String[] args) {
        String a = "aaa" ;
        String b = "bbb";

        System.out.println(BrandSorter.brandOrder(a, b));
        System.out.println(BrandSorter.brandOrder(b, a));

        System.out.println(ModelSorter.modelOrder(b, a));
        System.out.println(ModelSorter.modelOrder(a, b));

        Car saab = new Car("Saab", "93", 200);
        Car porshe = new Car("Porshe", "Carrera", 300);

        List<Car> sortedCars = CarSorter.sortCarsByModel(saab,porshe, (car1,car2) -> car1.compareTo(car2));
        List<Car> sortedCars2 = CarSorter.sortCarsByModel(saab,porshe, (car1,car2) -> car2.compareTo(car1));

        CarSorter.sortCarsByModel(saab,porshe, ModelSorter::modelOrder);

        CarPrinter carPrinter = car -> System.out.println(car);
        CarPrinter carPrinter1 = System.out::println;

        CarPrinter carPrinter3 = car -> car.printYourself();
        CarPrinter carPrinter4 = Car::printYourself;






        carPrinter1.printCar(saab);






    }
}
