package my_package.package_test.plant;

public class Cactus extends Plant{
    public Cactus(int heightInCm, int waterUseInMl, int currentWaterLevelInMl) {
        super(heightInCm, waterUseInMl, currentWaterLevelInMl);
    }

    @Override
    public void grow(){
        heightInCm += 1;

        currentWaterLevelInMl -= waterUseInMl;



    }

    @Override
    public int getRequierdWaterInMl() {
        requierdWaterInMl = 20;
        return requierdWaterInMl;
    }

    @Override
    public String toString() {
        return "Cactus{" +
                "heightInCm=" + heightInCm +
                ", waterUseInMl=" + waterUseInMl +
                ", currentWaterLevelInMl=" + currentWaterLevelInMl +
                '}';
    }
}
