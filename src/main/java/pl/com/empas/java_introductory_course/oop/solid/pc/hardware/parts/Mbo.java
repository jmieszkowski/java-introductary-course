package pl.com.empas.java_introductory_course.oop.solid.pc.hardware.parts;

public class Mbo extends PowerConsumer {

    private CpuType cpuType;

    public Mbo(String name, int price, int powerConsumption, CpuType cpuType) {
        super(name, price, powerConsumption);
        this.cpuType = cpuType;
    }

    public CpuType getCpuType() {
        return cpuType;
    }

    public void setCpuType(CpuType cpuType) {
        this.cpuType = cpuType;
    }
}
