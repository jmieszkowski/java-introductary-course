package plant;

public class Rose extends Plant {

    public Rose(int heightInCm, int waterUseInMl, int currentWaterLevelInMl) {
        super(heightInCm, waterUseInMl, currentWaterLevelInMl);
    }

    @Override
    public void grow() {
        heightInCm += 5;
        currentWaterLevelInMl -= waterUseInMl;

    }

    @Override
    public int getCurrentWaterLevelInMl() {
        requierdWaterInMl = 200;
        return requierdWaterInMl;
    }

    @Override
    public String toString() {
        return "Rose{" +
                "heightInCm=" + heightInCm +
                ", waterUseInMl=" + waterUseInMl +
                ", currentWaterLevelInMl=" + currentWaterLevelInMl +
                '}';
    }
}
