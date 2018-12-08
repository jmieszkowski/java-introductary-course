package plant;

public class Gardener {
    public void waterPlant(Plant plant){


        plant.increaseWaterlLevel(plant.getRequierdWaterInMl());

    }
    public void makePlantGrow(Plant plant){
        plant.grow();
    }

}
