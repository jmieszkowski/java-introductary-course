package plant;

public class Plant {

    protected int heightInCm;
    protected int waterUseInMl;
    protected int currentWaterLevelInMl;
    protected int requierdWaterInMl;

    public Plant(int heightInCm, int waterUseInMl, int currentWaterLevelInMl){
        this.heightInCm = heightInCm;
        this.waterUseInMl = waterUseInMl;
        this.currentWaterLevelInMl = currentWaterLevelInMl;

    }

    public int getRequierdWaterInMl(){
        return requierdWaterInMl;
    }

    public void increaseWaterlLevel(int waterInMl){
        currentWaterLevelInMl += waterInMl;
    }
    public void grow(){
        // empty
    }

    public int getHeightInCm() {
        return heightInCm;
    }

    public int getWaterUseInMl() {
        return waterUseInMl;
    }
    public int getCurrentWaterLevelInMl(){
        return currentWaterLevelInMl;
    }

}
