package pl.com.empas.java_introductory_course.oop.solid.pc.hardware.parts;

public class PowerConsumer extends HardwarePart {
    protected int powerConsumption;

    public PowerConsumer(String name, int price, int powerConsumption) {
        super(name, price);
        this.powerConsumption = powerConsumption;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }
}
