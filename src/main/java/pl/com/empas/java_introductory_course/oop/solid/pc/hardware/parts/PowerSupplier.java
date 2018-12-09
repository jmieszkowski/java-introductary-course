package pl.com.empas.java_introductory_course.oop.solid.pc.hardware.parts;

public class PowerSupplier extends HardwarePart {
    private int powerSupply;

    public PowerSupplier(String name, int price, int powerSupply) {
        super(name, price);
        this.powerSupply = powerSupply;

    }

    public int getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(int powerSupply) {
        this.powerSupply = powerSupply;
    }
}
