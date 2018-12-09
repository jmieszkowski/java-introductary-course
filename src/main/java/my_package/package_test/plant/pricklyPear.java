package my_package.package_test.plant;

public class pricklyPear extends Plant{

    public pricklyPear(int heightInCm, int waterUseInMl, int currentWaterLevelInMl) {
        super(heightInCm, waterUseInMl, currentWaterLevelInMl);
    }

    @Override
    public void grow() {
        heightInCm += 3;
        currentWaterLevelInMl -= waterUseInMl;
    }

    @Override
    public int getCurrentWaterLevelInMl() {
        requierdWaterInMl = 70;
        return requierdWaterInMl;
    }

    @Override
    public String toString() {
        return "pricklyPear{" +
                "heightInCm=" + heightInCm +
                ", waterUseInMl=" + waterUseInMl +
                ", currentWaterLevelInMl=" + currentWaterLevelInMl +
                '}';
    }
}
