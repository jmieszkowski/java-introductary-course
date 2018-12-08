package vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle porshe = new Car();
        Vehicle vehicle = new Vehicle();

        vehicle.printName();

        porshe.printName();

        porshe.move();
//        ((Car) porshe).speedUp();

        Car carForSure =(Car) porshe;

//        Boat boad = (Boat) porshe; // rzutowanie w dół(down casting). Dlatego, że porshe jest nadrzędne(Vehicle)
//        boad.printName();



    }

}
