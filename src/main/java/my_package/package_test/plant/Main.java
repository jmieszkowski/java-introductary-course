package my_package.package_test.plant;

import my_package.enum_example.Days;

public class Main {
    public static void main(String[] args) {
        Gardener gardenerJedrek = new Gardener();

        Plant[] plantArray = makePlants();
        for(Days days : Days.values()){
            System.out.println(days);
            System.out.println();

            for(Plant p : plantArray){
                gardenerJedrek.waterPlant(p);
                gardenerJedrek.makePlantGrow(p);
                System.out.println(p);
            }

            System.out.println();
            System.out.println("---------End of the day---------");
            System.out.println();
        }
    }


        public static Plant[] makePlants () {
            Plant[] plantArray = new Plant[6];

            plantArray[0] = new Rose(10, 70, 500);
            plantArray[1] = new Rose(20, 90, 500);

            plantArray[2] = new Cactus(20, 30, 100);
            plantArray[3] = new Cactus(50, 60, 100);

            plantArray[4] = new pricklyPear(40, 70, 200);
            plantArray[5] = new pricklyPear(50, 80, 300);

            return plantArray;


    }
}
