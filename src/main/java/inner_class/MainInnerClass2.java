package inner_class;

public class MainInnerClass2 {

    public static void main(String[] args) {

        House betterHouse = new House();
        betterHouse.setHouseName("Java home");
        House.Apartment myNewApartment = betterHouse.new Apartment(80);

        myNewApartment.printNameOfHouse();

        House betterHouse2 = new House();
        betterHouse2.setHouseName("C# home");

        House.Apartment friendApartment = betterHouse2.new Apartment(40);

        friendApartment.printNameOfHouse();


    }


}
